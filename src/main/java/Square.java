public class Square extends Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public Square paint(){
        return new Square();
    }

    @Override
    public Square getRandomShape() {
        Square square = paint();
        square.setSide(Math.random() * 100);
        square.setColor();
        square.area = square.getSide() * square.getSide();
        return square;
    }

    public String toString() {
        return super.toString() + "длина стороны: " + Math.round(this.getSide()) + " ед.";
    }
}
