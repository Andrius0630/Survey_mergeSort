public class Candidate {
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
        return "\n{" +
                "\n\tid: " + id +
                ",\n\tname: " + name +
                "\n}";
    }

}