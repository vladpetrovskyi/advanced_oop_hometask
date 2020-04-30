public abstract class Shape {
    private Color color;

    public abstract Shape getRandomShape();

    public abstract double getArea();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getShapeClass() {
        return this instanceof Square ? "квадрат"
                : (this instanceof Triangle ? "треугольник"
                : (this instanceof Circle ? "круг" : "трапеция"));
    }

    public Color getRandomColor() {
        int i = (int) (Math.random() * 10);
        return i == 7 ? Color.BLUE : (i == 6 ? Color.GREEN
                : (i == 5 ? Color.RED : (i == 4 ? Color.ORANGE
                : (i == 3 ? Color.YELLOW : (i == 2 ? Color.VIOLET
                : (i == 1 ? Color.BLACK : Color.WHITE))))));
    }

    public String draw() {
        return "Фигура: " + getShapeClass() + ", цвет: " + getColor()
                + ", площадь: " + Math.round(getArea()) + " кв.ед., ";
    }
}