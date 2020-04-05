public abstract class Shape {
    protected double area;
    private String color;

    public abstract Shape paint();

    public abstract Shape getRandomShape();

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        int i = (int) (Math.random() * 10);
        this.color = i == 9 ? "голубой" : (i == 8 ? "зелёный"
                : (i == 7 ? "красный" : (i == 6 ? "оранжевый"
                : (i == 5 ? "жёлтый" : (i == 4 ? "фиолетовый"
                : (i == 3 ? "чёрный" : (i == 2 ? "белый"
                : (i == 1 ? "лиловый" : "сиреневый"))))))));
    }

    public String getShapeClass() {
        return this instanceof Square ? "квадрат"
                : (this instanceof Triangle ? "треугольник"
                : (this instanceof Circle ? "круг" : "трапеция"));
    }

    public String toString() {
        return "Фигура: " + getShapeClass() + ", цвет: " + getColor()
                + ", площадь: " + Math.round(getArea()) + " кв.ед., ";
    }
}