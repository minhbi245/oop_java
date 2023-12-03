package data;

/*
    Các bước để làm 1 class con
    1. Con extends class/Khuôn Cha
    2. Đặc điểm của con là gì, nếu đã có ở Cha thì dùng của Cha có sẵn
    3. Tạo phễu của Con, thỏa hiệp với cha
    4. Nếu Cha là abstract thì con có 2 khả năng
        - Con làm abstract, con làm biếng và không thực hiện những thiếu sót/khiếm khuyết/ lời nói của Cha thì Con cũng là abstract luôn
        - Còn Con muốn là concrete class/khuôn cụ thể thì sẽ cần implement các method khiếm khuyết của Cha
 */

// Square sẽ cần kế thừa ai???
/*
    Nếu mà Square extends Shape? Mình phải làm những việc gì?
        - Extends Shape
        - Khai báo các đặc điểm/properties của Square, dị biệt của Square
        - Khai báo phếu, bản sắc, thỏa hiệp, đảo vị trí nếu cần
        - Vì Shapre là abstract, thì ta cần implement all abstract method/các hàm của abstract/ viết các code thực thi của 3 hàm có ở Shape
 */

/*
    Nếu mà Square extends Rectangle? Mình phải làm gì???
        1. Extends Rectangle
        2. Ko có biến dị gì với các đặc điểm của Rectangle, thì ko cần phải khai báo thêm đặc điểm/properties gì nữa
        3. Cần làm phếu/Constructor cho Con, nếu cần thì thỏa hiệp, bản sắc, đảo thứ tự nếu cần
        4. Ko cần làm gì thêm vì Rectangle quá ổn -> Concrete Class/ Đã cụ thể đầy đủ -> DONE MẸ NÓ RỒI VÌ ỔN RỒI
        5. Nếu muốn độ lại thì cứ làm

        Shape là Ông nội, con là Rectangle, cháu nội là Square - Gọi là cây gia phả
 */
public class Square extends Rectangle {

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }

    // Đoạn này học rồi
    // Ko cần khai báo gì thêm nữa, Vuông là Hình chữ nhật có 2 cạnh == nhau
    // Nếu muốn biến dị cứ làm, đã học ở bài Parent Child

    // Muuốn in riêng, ko muốn in chung với Cha Rectangle
    @Override
    public void paint() {
        System.out.printf("|SQUARE   |%-10s|%-10s|%-10s|%4.1f|%7.2f|\n", owner, color, borderColor, a, getArea());
    }

    public void sayHi() {
        System.out.println("Các con ơi là các con. Học hành thế này"
                + " thì éo còn gì ngoài cái dây nịt á!!!");
    }
}
