/*
* andrius.kolenda@mif.stud.vu.lt
* Purpose: 
* 2025-03-
* run on linux: javac -cp gson*.jar -d classe *.java && java -cp gson-2.12.1.jar:classes Main
*/

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            final String candidatesFileName = "Candidates.json";
            final String resultsFileName = "Results.json";

            ReaderFromJSON JSONRreader = new ReaderFromJSON();
            HashMap<Integer, Candidate> candidatesHM = JSONRreader.readCandidates(candidatesFileName);
            ArrayList<Result> resultsAL = JSONRreader.readResults(resultsFileName);

            for (Result res : resultsAL) {
                int candidateId = res.getCandidateId();
                res.setCandidateName(candidatesHM.get(candidateId).getName());
            }

            //System.out.println(candidatesHM.toString());
            System.out.println("\nUnsorted");
            System.out.println(resultsAL.toString());

            System.out.println("\nSorted");
            MergeSort.mergeSort(resultsAL);
            System.out.println(resultsAL.toString());

            HashMap<Integer, VoteSummary> votesSummaryHM = new HashMap<>();

            for (Result result : resultsAL) {
                int candidateId = result.getCandidateId();
                VoteSummary summary = votesSummaryHM.getOrDefault(candidateId, new VoteSummary());
                summary.addVote(result.getVote());
                votesSummaryHM.put(candidateId, summary);
            }

            System.out.println("Summarised results:");

            for (Integer candidateId : votesSummaryHM.keySet()) {
                String name = candidatesHM.get(candidateId).getName();
                VoteSummary summary = votesSummaryHM.get(candidateId);

                System.out.println("candidateId=" + candidateId +
                        ", name=" + name +
                        ", numOfYes=" + summary.getYesCount() +
                        ", numOfNo=" + summary.getNoCount() +
                        ", numOfMaybe=" + summary.getMaybeCount());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}