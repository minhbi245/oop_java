package data;

public abstract class Person {
    protected String id;
    protected int yob;
    protected String name;

    public Person(String id, int yob, String name) {
        this.id = id;
        this.yob = yob;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void showProfile();
}
