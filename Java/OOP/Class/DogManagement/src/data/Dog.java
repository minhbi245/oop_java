package data;

// Khuôn dùng để đúc ra các object, đối tượng cần lưu trữ info, thứ làm ra để bán
// khuôn phải kín, cõ phễu để chế/rót/hứng/đổ vào cá data, nguyên liệu
public class Dog {
    // Chứ đặc điểm, chi tiết mà cái Khuôn/Class, object tương sẽ có
    // Khuôn/Class design ra sao, mai mốt object có thể
    private String name;
    private int yob;
    private double weight;
    // ...
    // ~ CMND, Thẻ căn cước, khác value đổ vào, Template

    // Có Khuôn/Class thì phải có phễu/miệng loe để hứng vật liệu đi vào
    // Phễu dùng để nhận vật liệu đúc ra, tạo ra, construct cái object
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;
    }

    /*
        Phễu còn gọi là constructor, hàm khởi tạo, hàm đúc, hàm tạo dựng ra object thông qua nó như cái phễu vật liệu
        chảy vào trong Khuôn/Class
        Vật liệu khô ra object/bức tượng, cmnd của ai, hồ sơ được tạo ra
        CONSTRUCTOR, PHẾU LÀ HÀM CỰC KÌ ĐẶC BIỆT, VÌ NÓ DÙNG ĐỂ TẠO RA OBJECT
        CỨ MỖI LẦN XÀI NÓ, TỨC LÀ PHẢI ĐƯA VẬT LIỆU VÀO, TỨC LÀ CÓ 1 OBJECT MỚI
        PHỄU NÀY/CONSTRUCTOR NÀY CỰC KÌ ĐẶC BIỆT, KO CÓ GIÁ TRỊ TRAẢ VỀ, KO VOID LUÔN TAO SẼ ÓI VỀ NGUYÊN BỨC TƯỢNG NÀY ĐANG ĐÚC
        *TÊN 100% giống class
    */

    /*
        Viết hàm xử lí data, ví dụ như giao tiếp hỏi năm sinh
        Mày hoi rtao trả lời, vì ba má đã fill yob = 1993
        object thì gọi là hành động/behavior, xử lí tính toaoán trên
        biên được đổ value từ lúc đúc ra
    */


    // Hàm gọi nhiều lần tương đương các hành động mà object nào d đó lặp đi lặp lại
    // Hành động của object gọi nhiều lần trên object đó
    public void bark() {
        System.out.println("Gaugaugau.... my name is: " + name);
        System.out.println("Gaugaugau.... my yob is: " + yob);
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }

    // Mình đi xăm mình, nhuộm tóc, thay đổi cân nặng
    // Thay đổi info ba má đã từng cho mình lúc ba má new/đúc ra mình
    public void setNewWeight(double newWeight) {
        weight = newWeight;
    }

    // Vì mặc định info sẽ là sẽ được giấu đi - vì info là nội dung nhạy cảm
    // Khi mình giao tiếp/ khi cần thiết thì mới bật nó ra
    // Chia sẻ info khi được hỏi, đó chính là method hàm hành động get()

    public int getYob() {
        return yob;
    }
}

// Code bên ngoài là giống như khuông bị lủng
/*
*   ENCAPSULATION: TÍNH ĐÓNG GÓI CỦA THÔNG TIN VÀ HAN ĐỘNG
*   HÀM VÀ BIẾN ĐI KÈM VỚI NHAU ĐẠI DIỆN, MÔ TẢ CHO 1 OBJECT, THƯ THỂ(SỐNG)
*
*
*
* */
