/**
 * 1. Phát hiện IS A, extends
 * 2. Khai báo các đặc điểm của Con/Child
 *  2.1 Nếu Con trùng với Cha về đặc điểm thì ta ko cần khai báo, ko cần làm vì Cha lo.
 *  2.2 Con có quyền dị biệt, đột biến đặc điểm so với Cha, dị biệt hành động luôn (ko bàn về @Override
 *
 * 3. Phễu/Contructor Con, giữ bản sắc nếu cần, có field/variable/property thì contructor/phễu đổ vào
 */

public class Child extends Parent{
    private String childAsset; // Con tự tạo dựng cơ ngơi/tài sản riêng, sure là Cha ko biết đâu

    public Child(String assetOne, String assetTwo, String childAsset) {
        super(assetOne, assetTwo); // must be/have to 1st statement in the Child's constructor/phễu
        this.childAsset = childAsset;
    } // Cha chưa tồn tại, lấy chỗ éo đâu mà cho Con extends
        // Có Cha rồi moới có Con, Cha sẽ là cánh chim, đưa Con bay thật xa
        // new Cha mở rộng nhớ Cha, mới có chỗ cho Con

    public String getChildAsset() {
        return childAsset;
    }

    public void setChildAsset(String childAsset) {
        this.childAsset = childAsset;
    }

    @Override
    public void showAll() {
        System.out.println("CHILD: asset1: " + assetOne + "; asset2: " + assetTwo);
        System.out.println("By the way, Here is my own asset: " + childAsset);
    }
}
