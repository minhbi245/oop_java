package data;

/**
 *
 * @author giao-lang | fb/giao.lang.bis | fb/bmag.vn
 * version 18.03
 */
public abstract class Pet implements Comparable<Pet>{

    protected String id;
    protected String name;
    protected int yob;
    protected double weight;

    public Pet(String id, String name, int yob, double weight) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    //thú cưng cần chạy thử để test trạng thái sức khỏe
    //test sức bền thể lực khi khám bệnh
    public abstract double run();

    //in ra chi tiết hồ sơ của thú cưng
    public abstract void showProfile();
    
    @Override
    public int compareTo(Pet that) {
        return this.id.compareToIgnoreCase(that.id);
    }
    //so sánh trên ID của Pet, ko quan tâm Dog hay Cat
    //mặc định loài Pet GATO/comparable trên đặc tính ID
}
