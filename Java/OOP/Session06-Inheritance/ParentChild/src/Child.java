public class Child extends Parent{
    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }

    @Override
    public void showAll() {
        System.out.println("CHILD: assetOne: " + assetOne + "; assetTwo: " + assetTwo);
    }

    public void sayHello() {
        System.out.println("Hey, I'm a rich kid!!!");
    }
    // Biến dị hoàn tonaf, tức là có hàm mà bên Cha ko có
    // Đừng hỏi tui nếu Cha có thêm hàm, bớt hàm, Con bị ảnh hưởng liền
}
