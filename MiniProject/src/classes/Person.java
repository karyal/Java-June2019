package classes;

public class Person {
    protected int id;
    protected String fullName;
    //constructors
    //getters()
    //setters()
    //toString()
    public Person() {
        this.id = 0;
        this.fullName = "";
    }
    public Person(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }
    public Person(Person p) {
        this.id = p.id;
        this.fullName = p.fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return ( id + ", " + fullName);
    }
}
