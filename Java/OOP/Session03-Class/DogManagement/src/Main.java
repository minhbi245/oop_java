import data.Dog;

public class Main {
    public static void main(String[] args) {
        Dog cauVang = new Dog("Cậu vàng", 5, 5.5);
        cauVang.getInfo();

        cauVang.setWeight(7.0);
        cauVang.getInfo();
    }
}