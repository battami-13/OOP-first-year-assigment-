public class Square extends Shape {
    private int side;

    public Square(Coordinates pos, int side) {
        super(4, pos);
        this.side = side;
    }

    public double getArea() { return side * side; }

    public double getPerimeter() { return 4 * side; }

    public void scale(int factor, boolean sign) {
        if (sign) side *= factor;
        else side /= factor;
    }

    public String display() {
        return "Square: " + position.display() +
                " Side=" + side +
                " Area=" + getArea() +
                " Perimeter=" + getPerimeter();
    }
}