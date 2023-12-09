import data.DeathRacer;
import data.Dog;
import data.Motor;
import data.Pet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        runToDead();
    }

    public static void runToDead() {

        // CÓ QUYỀN CÓ AI ĐÓ CHẠY NGANG NHẢY VÔ
        // MĨ NHÂN NGƯ CỦA CHÂU TINH TRÌ NHẢY VÀO!!!
        // Người Cá đúng chuẩn - class Mermaid thì chuyên ngồi mỏm đá, dụ thủy thủ đến bắt ăn thịt!!!
        // nếu ta làm class Mermaid rời - concrete class, phải chuột tạo mới class Mermaid
        // Viết code bình thường, code này có hàm batThuyThuVaAnThit();
        // bắt Mermaid implements DeathRacer, bắt người cá đi đua chuyện quá đáng
        // ko phù hợp với logic, người cá ko thích di chuyển đi đua đâu!!!

        // Nhưng lại có 1 nàng người cá thích ăn chay, lên bờ chơi với con người
        // Không theo logic chung của người cá là ăn thịt người/thủy thủ
        // Object lẻ không nhập chung đoàn/loại Mermaid truyền thống
        // không bắt toàn bộ loài Mermaid implements DeathRacer
        // Mĩ nhân ngư của Châu Tinh Trì phá đoàn/loài, tham gia đua dưới kênh Nhiêu Lộc cho vui
        // ko bắt cả họ nhà Người Cá đi đua
        // object đánh lẻ, đánh lẻ đi đua, thì chỉ cần đua tốc độ là được rồu
        // Anonymous Class, ko thèm tạo class rời, mà vẫn tham gia CLB
        // chỉ cần có hành động của CLB là okie rồi, ghé ngang thoy thì cũng phải hành động.
        // hành động, implements all abstract methods on the go, take-away

        // làm class riêng lẻ/Concrete class để nhân bản được nhiều Member
        // làm on the go dành cho vãng lai ghé nang
        // CẢ 2 ĐỀU PHẢI IMPLEMENTS, @OVERRIDE VÌ CHA, CLB KO HOÀN HẢO

        // OBJECT ON THE GO, CẦN CÓ HÀM ĐUA VÀ GÁY THÀNH TÍCH LÀ XONG, ÉO CẦN LÀM CLASS RỜI/CONCRETE CLASS
        // ÉO LÀM CLASS CÓ SẴN ĐỂ NHÂN BẢN

        // DeathRacer miNhanNguChauTinhTri = new Mermaid(); // class rời sẽ có @Override
                                                            // 2 hàm runToDead() và showHowToDead()
                                                            // y chang Motor thôi à

        // Mượn gió bẻ măng, éo có Khuôn/Class sẵn, thì phải code @Override từ đầu,
        // Cho mỗi lần chơi trò làm biếng tạo Khuôn
        // On the go @Override

        DeathRacer miNhanNguChauTinhTri = new DeathRacer() {
            // ĐÂY CHÍNH LÀ VÙNG KO GIAN/RAM/MEMORY CỦA CLASS/KHUÔN MERMAID MÀ TA LÀM BIẾNG LÀM RIÊNG CONCRETE CLASS
            // VÙNG NÀY CHÍNH LÀ PHẦN MỞ RỘNG CỦA CHA/CLB
            // CHA SẼ LÀ CÁNH CHIM (new/super()) new DeathRacer)
            // đưa Con extends/implements thật xa thật nhiều @Override
            // ta có quyền làm như truyền thống, thêm đặc điểm...
            // đùng lạm dụng, on-the-go thì nên quan tâm phần đang tham gia

            // Anonymous làm biếng tạo clas rời cho cả abstract clas và interface
            // Bến Abstract class thì ta còn có đặc điểm của Cha cho dễ xài
            // Còn bên Anonymous của Interface, đua thì đua đi, hỏi han làm chi, ko có info đâu mà xài
            public static final double MAX_SPEED = 50;
            @Override
            public double runToDead() {
                return new Random().nextDouble() * MAX_SPEED * 3;
            }

            @Override
            public void showHowToDeath() {
                System.out.printf("|%-20s|%-15s|%5.1f|\n", "MERMAID-RACER", "MI NHAN NGU CHAU TINH TRI", runToDead());
            }
        };  // VIP

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

        // miNhanNguChauTinhTri em vẫn là một racer, có hành động đua gấp 3 lần giới hạn vật lí của người cá, em xứng đáng gia nhập CLB đua, vào lane để đua
        DeathRacer[] racer  = new DeathRacer[]{d1, (Dog)d2, d3, m1, m2, miNhanNguChauTinhTri};
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
