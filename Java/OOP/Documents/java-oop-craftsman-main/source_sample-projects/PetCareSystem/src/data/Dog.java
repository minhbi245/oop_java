package data;

import java.util.Random;

/**
 *
 * @author giao-lang | fb/giao.lang.bis | fb/bmag.vn
 * version 18.03
 */
public class Dog extends Pet {

    private static final double MAX_SPEED = 40.0;
    //loài Dog chạy tối đa 40km/h

    public Dog(String id, String name, int yob, double weight) {
        super(id, name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
        //chú dog bất kì chạy tốc độ tối đa ko 
        //vượt quá MAX_SPEED 
    }

    @Override
    public void showProfile() {
        String msg;
        msg = String.format("|%6s|%-15s|%4d|%4.1f|%4.1f|", id, name, yob, weight, run());
        System.out.println(msg);
        //in thông tin chi tiết của Dog theo chuẩn soái ca/tabular/ 
        //gióng lề kiểu Excel
    }
}
