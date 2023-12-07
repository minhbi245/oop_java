import data.DeathRacer;
import data.Dog;
import data.Motor;
import data.Pet;

public class Main {
    public static void main(String[] args) {
        runToDead();
    }

    public static void runToDead() {
        Dog d1 = new Dog("NGÁO ĐÁ", 2021, 50);
        // Chấm full hàm của con, đủ code hàm Cha và hàm của bên CLB

        Pet d2 = new Dog("VÀNG ƠI", 1950, 10.0);
        // Chấm fuill hàm Cha, khai Cha, chạy ko sợ vì có tính chất đa hình Con qua mặt
        // Tổ lái con trỏ được, new Dog mà sợ gì
        // Tao là "danh nghĩa của Cha" thì chỉ xổ Cha hoy, học rồi
        // Mày biết Bố tao là ai ko???, hù theo kiểu Bố


        DeathRacer d3 = new Dog("NANH TRẮNG", 1901, 20.0);
        // Ngộ nhỡ dấu chấm thì sao???
        // Chấm chỉ xổ full CLB, 2 hàm runToDead() showHowToDead()
        // tao là Đua Thủ chỉ quan tâm đua hoy
        // chạy éo sợ vì Con qua mặt, có đủ hàm @Override đã làm rồi, đa hình tiếp
        // Ép con trỏ được luôn, new Dog mà sợ gì

        Motor m1 = new Motor("EXCITER", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0cm3", "56F6-67889");

        DeathRacer[] racer  = new DeathRacer[]{d1, (Dog)d2, d3, m1, m2};
        // racer[0] = new Dog(...);
        // racer[1] = new Motor(...);
        // toàn bộ là DeathRacer, đa hình là đa hình trên runToDead() showHowToDead()
        // Con tự lo, con Motor chạy theo Motor, con Dog chạy theo Dog

        System.out.println("The racing record");
        for (DeathRacer x: racer) {
            x.showHowToDeath();
        }
    }
}
