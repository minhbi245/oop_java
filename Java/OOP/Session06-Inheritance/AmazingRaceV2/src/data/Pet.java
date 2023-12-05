package data;

// Cha là nhân tử chung của đám Con
// Việc riêng/dị biệt để ở đám Con lo
public abstract class Pet {
    protected String name;
    protected int yob;
    protected double weight;

    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Hành động chạy và việc khoe, gáy thành tích sure là abstract
    public abstract double run();   // Chạy khác nhau
    public abstract void showRecord();  // gáy thành tích cũng khác nhau
}
