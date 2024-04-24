package data;

public class Dog {
    // trong Class/Khuôn sẽ chứa các info qua biến = value
    // Giống như ca phôi CCCD/CMND/Form. Chưừa chỗ bên trong để fill value vào sau

    private String name;
    private int yob;
    private double weight;

    // Một cái khuôn/Class cần cái phễu để hứng vật liệu/giá trị đưa vào
    public Dog(String name, int yob, double weight) {
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

    public void getInfo() {
        System.out.printf("|%25s|%10d|%10.2f|", name, yob, weight);
    }
}
