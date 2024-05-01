import data.Dog;

public class Main {
    public static void main(String[] args) {

        Dog chiHua = new Dog("CHI HU HU", 2020, 0.5);
        Dog ngaoDa = new Dog("NGAO DA", 2021, 50.0);

        chiHua.bark();
        ngaoDa.bark();
    }
}