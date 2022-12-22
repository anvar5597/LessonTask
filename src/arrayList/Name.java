package arrayList;

public class Name implements Comparable<Name>{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Name o) {
        return this.getName().compareTo(o.getName());
    }
}
