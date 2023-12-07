package data;

import java.util.Random;
// Dog ngoan ngoãn ban ngày, tối chủ đi ngủ, nó trốn nhà đi hoang
// Đi đua thì nó phải chạy vượt tốc độ bình thường, runToDead() như mọi đua thủ
// Mình vẫn là Con Cháu dòng họ Lê, Phạm, học như bt, sinh viên
// Nhưng còn tham gia CLB Đua thủ, Phượt, hoặc CLB gì đó,thì phải có hành động của CLB đó
// IMPLEMENT ALL ABSTRACT METHODS, NỌI QUY CỦA CLB, @OVERRIDE
public class Dog extends Pet implements DeathRacer {
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "DOG", name, yob, weight, run());
    }

    // PHẦN HOANG DÃ TRONG TA, BỘC LỘ KHI ĐUA
    // TỤI MÀY, SV, NGOAN NGOÃN Ở NHÀ GIÃN CÁCH
    // VÀO SG, CHẮC CHẮN THÊM PHẦN BỘ LỘ KHÁC: NHẬU NHỆT, GAME, CÁ ĐỘ, ĐÁNH BÀI,..
    //                                      CLB TIẾNG ANH, PHƯỢT, TỪ THIỆN, CẦU LÔNG
    @Override
    public double runToDeath() {
        return run() * 5;   // CHẠY NHANH HƠN 5 LẦN SO VỚI BT
    }

    @Override
    public void showHowToDeath() {
        System.out.printf("|%-20s|%-10s|%4d|%4.1f|%4.1f|\n", "DOG-RACER", name, yob, weight, runToDeath());
    }
}
