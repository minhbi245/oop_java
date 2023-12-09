package data;

import java.util.Random;

// MOTOR MUA VỀ ĐỂ CHẠY ĐI HỌC, CHUYỆN BÌNH THƯỜNG THÔI, CÓ HÀNH VI RUN()
// NHƯNG TRÊN ĐƯỜNG CÓ THẰNG VÓ VẨN NÀO ĐÓ NẸT-PÔ, MÌNH CŨNG KÉO TAY GA MẠNH HƠN ĐỂ
// BỐC ĐẦU, VỌT XE, TỐC ĐỘ PHẢI DỮ HƠN BÌNH THƯỜNG, LÚC NÀY NGOÀI VIỆC MOTOR
// THÔNG THƯỜNG, TA CÒN LÀ ĐUA-THỦ NỮA, PHẢI LÀ ĐUA THỦ MỚI CÓ TỐC ĐỘ CAO
// GIA NHẬP HỘI ĐUA THOY, CHỈ ĐUA THOY
// TỚ CÒN LÀ 1 ĐUA-THỦ, KO DÙNG TỪ KHÓA EXTENDS, XÀI TỪ LÀ 1 MEMBER CỦA CLB/INTERFACE NÀO ĐÓ
//                                                       IMPLEMENTS
//                                                  TỚ THAM GIA CLB, TRIỂN KHAI VIỆC ĐUA
// THAM GIA CLB NÀO THÌ PHẢI CÓ HÀNH ĐỘNG CỦA CLB ĐÓ
// IMPLEMENT ALL ABSTRACT METHODS BÊN CLB, CHỌN ĐI ĐUA MÀ KO CHỊU ĐUA SAO ĐƯỢC
// @OVERRIDE
// CLASS CHÍNH CỦA CHUNG TA CỨ CÓ ĐẶC ĐIỂM VÀ HÀNH VI NHƯ BÌNH THƯỜNG
// CHÚNG TA THAM GIA CLB NÀO THÌ CÓ THÊM HÀNH ĐỘNG CỦA CLB ĐÓ, @OVERRIDE HÀNH ĐỘNG ĐÓ
// TRONG TA CÓ NHIỀU HÀNH ỨNG VỚI TỪNG CLB MÀ TA THAM GIA, HỢP LÍ Ở NGOÀI ĐỜI
// => CHÍNH LÀ CÂU CHUYỆN, ĐI VỚI BỤT MẶC ÁO CÀ SA, ĐI VỚI MA MẶC ÁO GIẤY
// VỀ MẶT LOGIC, TA CÓ THÊỂ THAM GIA NHIỀU CLB, NHƯNG TA CHỈ CÓ 1 DÒNG HỌ, 1 CHA
// TRONG JAVA, 1 CON CHỈ CÓ TỐI ĐA 1 CHA -> ĐƠN KẾ THỪA
//             1 CON THAM GIA NHIỀU CLB, NHƯ VẬY SẼ CÓ HĐ CỦA NHIỀU CLB
// C++, 1 CON LẠI CÓ NHIỀU CHA LUÔN -> ĐA KẾ THỪA!!!
public class Motor implements DeathRacer {

    public static final double MAX_SPEED = 180;

    private String model;   // Exciter 2021, Winner 2020
    private String volume;  // Thể tích, phân khối 125.0cm3
    private String vin;     // Biển số, số khung, Vehicle Identifier Number

    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "model='" + model + '\'' +
                ", volume='" + volume + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }

    // Hành vi của xe máy là chạy, có tốc độ được ghi nhận
    public double run() {
        return new Random().nextDouble() * Motor.MAX_SPEED;
    }                   // Chạy ngẫu nhiên và ko quá 180km/h

    // Quay video và gáy tốc độ
    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%8s|%11s|%5.1f|\n", "MOTOR", model, volume, vin, run());
    }

    @Override
    public double runToDead() {
        // CHẠY tốc độ cao hoy, đôn nòng, xoáy nồng, đôn deên
        return run() * 3; // run() giả sử được 150 x 2 đua đến chết còn gì
    }

    @Override
    public void showHowToDeath() {
        System.out.printf("|%-20s|%-15s|%8s|%11s|%5.1f|\n", "MOTOR-RACER", model, volume, vin, runToDead());
    }
}
