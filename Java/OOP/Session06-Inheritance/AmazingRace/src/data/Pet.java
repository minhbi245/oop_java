package data;

public abstract class Pet {
    // Cha/Ông tổ chứa nhân tử chung của đám Con/Cháu
    protected String name;
    protected int yob;
    protected double weight;
    // ...


    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Hành động của mỗi con thú cụ thể
    // Hành động chạy của mỗi Con: Hoàn toàn khác nhau về tốc độ, khác nhau về dáng chạy
    // -> ngầm hiểu là xử lý khác nhau
    // Vậy việc chạy là 1 ý tưởng chung chung mà loài pet nó cần có
    // Chạy là 1 thứ đi kèm Pet, còn cụ thể thế nào thì là tùy từng đứa
    // => ABSTRACT METHOD. CAIS GÌ MÀ ÉO CỤ THỂ KHI ĐEỀ CẬP VÊỀ NÓ => SURE CHUNG CHUNG
    //                              ABSTRACT

    public abstract double run();

    // mỗi đứa gáy, sủa thành tích theo kiểu khác nhau
    public abstract void showRecord();  // tương đương với paint(); showProfile
}
