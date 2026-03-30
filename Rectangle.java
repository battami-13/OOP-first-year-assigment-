public class Rectangle extends Shape {
    private int width, length;

    public Rectangle(Coordinates pos, int width, int length) {
        super(4, pos);
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    public void scale(int factor, boolean sign) {
        if (sign) {
            width *= factor;
            length *= factor;
        } else {
            width /= factor;
            length /= factor;
        }
    }

    public String display() {
        return "Rectangle: " + position.display() +
                " Width=" + width + " Length=" + length +
                " Area=" + getArea() +
                " Perimeter=" + getPerimeter();
    }
}