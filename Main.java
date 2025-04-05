/*
* andrius.kolenda@mif.stud.vu.lt
* Purpose: 
* 2025-03-
*/

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            final String candidatesFileName = "Candidates.json";
            final String resultsFileName = "Results.json";
            ReaderFromJSON JSONRreader = new ReaderFromJSON(candidatesFileName);
            List<Candidate> candidatesList = JSONRreader.readCandidates();
            List<Result> resultsList = JSONRreader.readResults();

            System.out.println(candidatesList.toString());
            System.out.println(resultsList.toString());
















        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}