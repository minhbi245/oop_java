public class Main {
    public static void main(String[] args) {
        playWithPointer();
    }

    public static void playWithPointer() {
        Parent p = new Parent("NHÀ", "1000 BTC");
        p.showAll();    // p chấm xổ tất của Cha

        Child c1 = new Child("CĂN HỘ", "100 BTC");
        c1.showAll();   // c1 chấm xổ tất cuaủa Con (Cha cho + @ + thêm khác nữa!!!)
        c1.sayHello();

        Parent c2 = new Child("NHÀ PHỐ", "100 ETH");
        c2.showAll(); // Gọi Cha nhưng chạy Con - Override, để con lái xe
        // c2.sayHello(); ko xổ ra của riêng Con dù đã new Con và có sẵn trong RAM
        // Mình đang cư xử như Cha, dùng danh nghĩa Cha
        // Mày biết Cha/Bố/Ba tao là ai ko???? Ở đây hù theo kiểu của Cha/Ba/Bố vậy phải tuân theo hành động của Cha/Ba/Bố
        // KHAI BÁO KIỂU CHA, CHẤM THEO CHA
        // Giống như Hình vuông đang cu xử như hình chữ nhật
        // Con đang dùng danh nghĩa Cha/Ba/Bố, thì phải cư xử Cha/Ba/Bố
        // Vậy để lấy được hàm sayHello() của Con ta sẽ dùng kĩ thuật tổ lái con trỏ xuống đáy địa chỉ vùng new Con/RAM clone của Khuôn/Class Con sẽ lấy đuược hàm sayHello()
        // Child x = cần trỏ vùng new Con

        Child x = (Child)c2;    // Mày hãy ráng xuống vùng new Child, lấy cho tao cái tọa độ vùng new Child, tao sẽ giữ lại trong x
        //              c2 trỏ vùng new(malloc) Cha, super
        x.sayHello();
        // x cùng trỏ vùng new(malloc) NHÀ PHỐ

        // Cách 2, nương theo cách 1, nhưng không tốn 1 con trỏ Child
        // (Child)c2. ko xổ ra vì dấu châấm có độ ưu tiên cao, ăn theo data type

        ((Child)c2).sayHello(); // Dấu ngoặc thay đổi độ ưu tiên, ép xong đi đã rồi hãy chấm, kéo sợi dây thun xong chưa, xong rồi đó thì chấm gọi hàm có trong Child thôi

        // miễn lấy được tọa độ thì chấm thôi
        // tọa độ gán vào biến rồi chấm, quá bình thường
    }
}
