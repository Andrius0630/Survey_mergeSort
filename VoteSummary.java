public class VoteSummary {
    private int yesCount = 0;
    private int noCount = 0;
    private int maybeCount = 0;

    public int getYesCount() {
        return yesCount;
    }

    public void setYesCount(int yesCount) {
        this.yesCount = yesCount;
    }

    public int getNoCount() {
        return noCount;
    }

    public void setNoCount(int noCount) {
        this.noCount = noCount;
    }

    public int getMaybeCount() {
        return maybeCount;
    }

    public void setMaybeCount(int maybeCount) {
        this.maybeCount = maybeCount;
    }

    public void addVote(VoteType vote) {
        switch (vote) {
            case VoteType.Yes -> yesCount++;
            case VoteType.No -> noCount++;
            case VoteType.Maybe -> maybeCount++;
        }
    }
}
