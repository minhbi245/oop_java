import data.Rectangle;
import data.Shape;
import data.Square;

public class Main {
    public static void main(String[] args) {
        createShapes();

    }

    public static void createShapes() {
        Shape square1 = new Square("KHANH.NVM", "BLUE", "YELLOW", 6);
        Shape rect1 = new Rectangle("VINH", "GREEN", "RED", 6, 5);

        Shape[] shapes = new Shape[2];
        shapes[0] = square1;
        shapes[1] = rect1;

        for(Shape shape : shapes) {
            shape.display();
        }

        sortedShapes(shapes);
        System.out.println("The array shapes after sorted");
        for (Shape shape : shapes) {
            shape.display();
        }
    }

    public static void sortedShapes(Shape[] shape) {
        for (int i = 0; i < shape.length; i++) {
            for (int j = i + 1; j < shape.length; j++) {
                if (shape[i].getArea() > shape[j].getArea()) {
                    Shape temp = shape[i];
                    shape[i] = shape[j];
                    shape[j] = temp;
                }
            }
        }
    }
}