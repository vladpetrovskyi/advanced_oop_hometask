import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<>();
        do {
            Square square = new Square();
            shapesList.add(square.getRandomShape());
        } while ((int) (Math.random() * 100) % 2 == 0);
        do {
            Triangle triangle = new Triangle();
            shapesList.add(triangle.getRandomShape());
        } while ((int) (Math.random() * 100) % 2 == 0);
        do {
            Trapezoid trapezoid = new Trapezoid();
            shapesList.add(trapezoid.getRandomShape());
        } while ((int) (Math.random() * 100) % 2 == 0);
        do {
            Circle circle = new Circle();
            shapesList.add(circle.getRandomShape());
        } while ((int) (Math.random() * 100) % 2 == 0);
        for (Shape shape : shapesList) {
            System.out.println(shape.toString());
        }
    }
}
