public class Circle extends Shape {
    private double radius;

    @Override
    public Shape getRandomShape() {
        Circle circle = new Circle();
        circle.setRadius(Math.random() * 100);
        circle.setColor(getRandomColor());
        return circle;
    }

    @Override
    public String draw() {
        return super.draw() + "радиус: " + Math.round(getRadius()) + " ед.";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(this.radius, 2));
    }
}
