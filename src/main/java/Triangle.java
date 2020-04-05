public class Triangle extends Shape {
    private double base, height;

    @Override
    public Triangle paint() {
        return new Triangle();
    }

    @Override
    public Shape getRandomShape() {
        Triangle triangle = paint();
        triangle.setBase(Math.random() * 100);
        triangle.setHeight(Math.random() * 100);
        triangle.setColor();
        triangle.area = triangle.base * triangle.height /2;
        return triangle;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHypotenuse(Triangle triangle) {
        return Math.sqrt(Math.pow(triangle.base, 2) + Math.pow(triangle.height, 2));
    }

    @Override
    public String toString() {
        return super.toString() + "длина основы: " + Math.round(this.getBase()) + " ед., длина высоты: "
                + Math.round(this.getHeight()) + " ед., длина гипотенузы: "
                + Math.round(getHypotenuse(this)) + " ед.";
    }
}
