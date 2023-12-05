import data.*;

public class Main {
    public static void main(String[] args) {
        showRecords();
    }

    public static void showRecords() {
        Hamster nhat = new Hamster("NHẮT", 2021, 0.3);
        Pet[] racer = new Pet[]{new Dog("CHIHUHU", 2021, 0.5),
                new Dog("VÀNG ƠI", 1950, 10.5),
                new Cat("TOM", 1960, 15.0),
                new Cat("KITTY", 1990, 5.0),
                new Hamster("Jerry", 1960, 0.5),
                nhat};

        //racer[0] = new Dog("", 0, 0);
        // Phần tử mảng Pet thì phải gán 1 con Pet nào đó, như Cat, Dog, Hamster,...
        // gán = new Dog(...); [i] = cần tọa độ vùng new Con Mèo/Con Chó nào đó()
        // new Dog() ...: bố trí vùng RAM trong HEAP, gọi phễu đổ vào, lấy mốc tọa độ vùng new đưa cho biến con trỏ giữ/ hoặc cho ai đó
        // Đa hình quay trở lại
        // Vì mảng Pet[], mọi việc CHẤM LÀ CỦA CHA, CỦA PET, CHA TOÀN LÀ ABSTRACT
        // HOÀN TÒOÀN KO ĐÁNG LO, VÌ CON ĐÃ IMPLEMENT
        // CHA QUẤT ROI CHẠY ĐI CHÚNG MÀY, THÊ LÀ 3 ĐỨA CON CHẠY THEO TỐC ĐỘ CỦA RIÊNG CHÚNG
        // -> ĐA HÌNH XUẤT HIỆN -> OVERRIDE QUA MẶT CHA XUẤT HIỆN
        System.out.println("The records table");
        for (Pet x: racer) {
            // x = race[0], x = racer[i]
            x.showRecord();
        }
        // TẠI THỜI ĐIỂM NÀY, VIẾT CODE THẾ NÀY, KO SORT THÀNH TÍCH ĐƯỢC
        for (int i = 0; i < racer.length - 1; i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if (racer[i].run() > racer[j].run()) {
                    // Đa hình, hàm run() của Cha nhưng Con chạy tương ứng được: Hamster, Dog, Cat,...
                }   // Mỗi lần gọi run() để so sánh thì sẽ cho ra tốc độ khác nhau
                    // Bài về SV, Hình Học, diện tích hay điểm số GPA thì cố định cho n lần gọi
                    // Điểm TB GPA côố định cho đến khi cập nhật điểm mới
                    // for hoài, getGPA(), getS() cố định nê ta đảo được, sắp xếp được
                    // Bài Amazing Race bắt tụi nhỏ chạy 1 lượt để ghi nhận thành tích đã
                    // Sau đó ta sẽ so sánh trên thành tích chạy này
            }
        }
    }
}
