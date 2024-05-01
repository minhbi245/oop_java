package data;

public class Dog {
    private String name;
    private int yob;
    private double weight;

    // this ở đây chính là chỉ chính mình, của mình đó, mình ở đây là một cá thể, một object độc lập, là unique là duy nhất
    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void bark() {
        System.out.printf("|WOOF WOOF|%-15s|%5d|%5.2f|\n", name, yob, weight);
    }
}
