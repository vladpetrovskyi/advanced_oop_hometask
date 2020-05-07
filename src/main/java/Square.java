public class Square extends Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public Square getRandomShape() {
        Square square = new Square();
        square.setSide(Math.random() * 100);
        square.setColor(getRandomColor());
        return square;
    }

    @Override
    public double getArea() {
        return this.getSide() * this.getSide();
    }

    @Override
    public String draw() {
        return super.draw() + "длина стороны: " + Math.round(this.getSide()) + " ед.";
    }
}
