public class Candidate {
    private String name;

    public Candidate(String name) {
        if(name == null)
            throw new IllegalArgumentException();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}