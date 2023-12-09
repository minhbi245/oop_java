package data;

// CLB CỦA NHỮNG GÃ THÍCH ĐUA ĐẾN CHẾT, GOM NHỮNG CLASS, OBJECT MÀ CÓ CHUNG HÀNH ĐỘNG ĐUA, KO CARE CHUYỆN GÌ KHÁC
// CLB LÀ NƠI TẬP HỢP NHỮNG NGƯỜI CÓ CHUNG TIẾNG NÓI, HÀNH ĐỘNG, GIAO TIẾP/INTERFACE
// NÓ CŨNG LÀ HÌNH THỨC GOM KHUÔN/CLASS, GOM OBJECT PHÂN LOẠI VỀ CÁI GÌ ĐÓ, NHÓM GÌ ĐÓ
// LỎNG LẺO HƠN KẾ THỪA, KO CARE ĐẶC ĐIỂM, DI DUYỀN TUYỀN ĐẶC ĐIỂM, CHUNG HÀNH ĐỘNG THÌ VÀO CHƠI CHUNG THÔI
// MOTOR, DOG, ... IS A MEMBER OF, IS A DEADRACER
// ANH EM MÌNH LÀ STUDENT, SINH RA LÀ SINH VIÊN
// NHƯNG ANH EM MÌNH CÒN CÓ THỂ LÀ CẦN THỦ, CỜ THỦ, CẦU THỦ, SÁT THỦ, ... GAME THỦ
// ANH EM MÌNH NHÌN THEO DÒNG HỌ: CHÁU Ở NHÀ NGOAN LẮM
// => 1 OBJECT, KHUÔN HỘI NHẬP THEO 2 CÁCH: DÒNG HỌ BÀ CON, HOẶC HỘI NHÓM XÃ HỘI
// HỘI BÀ CON: DI TRUYỀN VÀ KẾ THỪA RẤT NHIỀU THỨ
// HỘI XÃ HỘI: CÙNG NHAU CHIẾN, LÀM 1 CÁI GÌ ĐÓ ĐI!!!

// Chỉ quan tâm hành động, trong đây chỉ chứa method/function vì chỉ quan tâm hành động, hành vi thôi
// Nhu là mình vào CLB tiếng Anh thì mình speakingEnglish theo giọng của mình!!!
// Đua thì đua theo cách của mình: lạng lách, tháo thắng, tung mình trên xe, cà chân chống tóe lửa
// Interface/CLB sẽ để mỗi người chơi tự chơi theo cách của mình - chơi - hành động là abstract/trừu tượng
// CHỈ NÓI NỘI QUY CLB THOY HENG, MỌI NGƯỜI THEO ĐÓ MÀ LÀM, TỰ MỖI NGƯỜI
// CHỐT HẠ: INTERFACE CHỨA HÀM ABSTRACT
// ko cần ghi ra từ khóa ABSTRACT ở cả tên của clb và tên hàm
// VÌ CLB HÀM Ý/NGẦM HIỂU CÓ HÀNH VI/NỘI QUY ĐỂ MỌI NGƯỜI THEO, NỘI DUNG CHUNG CHUNG, HÀNH VI CHUNG CHUNG
// ĐỂ MỌI NGƯỜI THEO - IMPLEMENT - NGẦM HIỂU INTERFACE LÀ ABSTRACT
// ABSTRACT LÀ NÊU Ý TƯỞNG
// JDK SAU CHO PHÉP INTERFACE CÓ HÀM CÓ CODE NHƯNG...!!!
public interface DeathRacer {

    // Phàm ai đã chọn nghề tham gia đua thủ, thì phải đua!!!
    public double runToDead(); // ko cần keyword ABSTRACT
    public void showHowToDeath();   // gáy bằng tổ quốc ghi công!!!
}
