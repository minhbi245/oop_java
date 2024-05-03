package data;

import java.lang.reflect.Array;

public class Shelf <T> {
    private final T[] shelf;
    private String color;
    private String label;
    private int count = 0;  // set mặc định luúc ban đầu tủ chưa có gì, count sẽ là 0

    public Shelf(String color, String label, Class<T> clazz) {
        this.color = color;
        this.label = label;
        // Khởi tạo mảng generic sử dụng Array.newInstance
        this.shelf = (T[]) Array.newInstance(clazz, 300);
    }

    public T[] getShelf() {
        return shelf;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addItem(T item) {
        if(count <= shelf.length) {
            shelf[count] = item;
            count++;
        } else {
            System.out.println("Shelf is full");
        }
   }
}
