import data.Cat;
import data.Dog;
import data.Pet;

public class Main {
    public static void main(String[] args) {
        register();
    }

    public static void register() {
        Cat tom = new Cat("TOM", 1950, 10.5, "><");
        tom.showRecord();
        Pet kitty = new Cat("KITTY", 1990, 5.0, "><");
        kitty.showRecord();

        Dog ngaoDa = new Dog("NGAO DA", 2021, 50.0);
        Pet beTo = new Dog("Bê-TÔ", 2012, 5.0);

        ngaoDa.showRecord();
        beTo.showRecord();
    }
}
