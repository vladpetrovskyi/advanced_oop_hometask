public class Trapezoid extends Shape{
    private double base1;
    private double base2;
    private double height;

    @Override
    public Shape getRandomShape() {
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setBase1(Math.random() * 100);
        trapezoid.setBase2(Math.random() * 100);
        trapezoid.setHeight(Math.random() * 100);
        trapezoid.setColor(getRandomColor());
        return trapezoid;
    }

    @Override
    public String draw() {
        return super.draw() + "основа 1: " + Math.round(getBase1()) + " ед., основа 2: "
                + Math.round(getBase2()) + " ед., высота: " + Math.round(getHeight()) + " ед.";
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
       return ((this.base1 + this.base2)/2) * this.height;
    }
}
