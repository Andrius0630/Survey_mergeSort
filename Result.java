public class Result implements Comparable {
    private int candidateId;
    private String candidateName = "N/A";
    private VoteType vote;
    private short month;

    public Result(int candidateId, short month, String vote) {
        if(candidateId < 0 || month < 0 || vote == null)
            throw new IllegalArgumentException();
        this.candidateId = candidateId;
        this.month = month;
        this.vote = VoteType.valueOf(vote);
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
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
        return "{\n\tcandidateId: " + candidateId + ",\n\tcandidateName: \"" + candidateName + "\",\n\tvote: \"" + vote.toString() + "\",\n\tmonth: " + month + "\n}";
    }

    @Override
    public int compareTo(Object obj) {
        Result res = (Result) obj;
        int differance = this.candidateName.compareTo(res.getCandidateName());
        if (differance != 0) {
            return differance;
        }
        return this.vote.compareTo(res.vote);
    }
}