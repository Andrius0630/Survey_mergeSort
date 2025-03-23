/*
* andrius.kolenda@mif.stud.vu.lt
* Purpose: 
* 2025-03-
*/

public class Main {
    public static void main(String[] args) {
        
    }
}

class JSONReader {

}

class Candidate {
    int id;
    String name;

    public Candidate(int id, String name) {
        if(id < 0 || name == null)
            throw new IllegalArgumentException();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{\n\tid: " + id + ",\n\tname: " + name + "\n}";
    }

}

class Result {
    int candidateId;
    VoteType vote;
    short month;

    public Result(int candidateId, short month, VoteType vote) {
        if(candidateId < 0 || month < 0)
            throw new IllegalArgumentException();
        this.candidateId = candidateId;
        this.month = month;
        this.vote = vote;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public VoteType getVote() {
        return vote;
    }

    public void setVote(VoteType vote) {
        this.vote = vote;
    }

    public short getMonth() {
        return month;
    }

    public void setMonth(short month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "{\n\tcandidateId: " + candidateId + ",\n\tvote: " + vote + ",\n\tmonth: " + month + "\n}";
    }
}

enum VoteType {
    Yes,
    No,
    Maybe
}