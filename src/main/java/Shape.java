import java.util.HashMap;
import java.util.Map;

public abstract class Shape {
    private Color color;
    private final static Map<Object, String> SHAPE_MAP = new HashMap<>();

    static {
        SHAPE_MAP.put(Square.class, "квадрат");
        SHAPE_MAP.put(Triangle.class, "треугольник");
        SHAPE_MAP.put(Circle.class, "круг");
        SHAPE_MAP.put(Trapezoid.class, "трапеция");
    }

    public abstract Shape getRandomShape();

    public abstract double getArea();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getShapeClass() {
        return SHAPE_MAP.get(this.getClass());
    }

    public Color getRandomColor() {
        return Color.values()[(int) (Math.random() * 4)];
    }

    public String draw() {
        return "Фигура: " + getShapeClass() + ", цвет: " + getColor()
                + ", площадь: " + Math.round(getArea()) + " кв.ед., ";
    }
}
