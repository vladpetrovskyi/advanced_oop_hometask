public class Triangle extends Shape {
    private double base;
    private double height;

    @Override
    public Shape getRandomShape() {
        Triangle triangle = new Triangle();
        triangle.setBase(Math.random() * 100);
        triangle.setHeight(Math.random() * 100);
        triangle.setColor(getRandomColor());
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
    public String draw() {
        return super.draw() + "длина основы: " + Math.round(this.getBase()) + " ед., длина высоты: "
                + Math.round(this.getHeight()) + " ед., длина гипотенузы: "
                + Math.round(getHypotenuse(this)) + " ед.";
    }

    @Override
    public double getArea() {
        return this.base * this.height /2;
    }
}
