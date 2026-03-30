public class Circle extends Shape {
    private int radius;

    public Circle(Coordinates pos, int radius) {
        super(0, pos);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void scale(int factor, boolean sign) {
        if (sign) radius *= factor;
        else radius /= factor;
    }

    public String display() {
        return "Circle: " + position.display() +
                " Radius=" + radius +
                " Area=" + getArea() +
                " Perimeter=" + getPerimeter();
    }
}