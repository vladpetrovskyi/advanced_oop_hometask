public class Circle extends Shape {
    private double radius;

    @Override
    public Circle paint() {
        return new Circle();
    }

    @Override
    public Shape getRandomShape() {
        Circle circle = paint();
        circle.setRadius(Math.random() * 100);
        circle.setColor();
        circle.area = (Math.PI * Math.pow(circle.getRadius(), 2));
        return circle;
    }

    @Override
    public String toString() {
        return super.toString() + "радиус: " + Math.round(getRadius()) + " ед.";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
