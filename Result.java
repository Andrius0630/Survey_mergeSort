import java.util.Arrays;

public class Result {
    int candidateId;
    VoteType vote;
    short month;

    public Result(int candidateId, short month, String vote) {
        if(candidateId < 0 || month < 0)
            throw new IllegalArgumentException();
        this.candidateId = candidateId;
        this.month = month;
        if(!vote.equalsIgnoreCase(Arrays.toString(VoteType.values())))
            throw new IllegalArgumentException();
        this.vote = VoteType.valueOf(vote);
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
        return "{\n\tcandidateId: " + candidateId + ",\n\tvote: " + vote.toString() + ",\n\tmonth: " + month + "\n}";
    }
}