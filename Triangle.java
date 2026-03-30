public class Triangle extends Shape {
    private Coordinates p1, p2, p3;

    public Triangle(Coordinates p1, Coordinates p2, Coordinates p3) {
        super(3, p1);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        return a + b + c;
    }

    public double getArea() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public void translate(int dx, int dy) {
        p1.translate(dx, dy);
        p2.translate(dx, dy);
        p3.translate(dx, dy);
    }

    public void scale(int factor, boolean sign) {
        p1.scale(factor, sign);
        p2.scale(factor, sign);
        p3.scale(factor, sign);
    }

    public String display() {
        return "Triangle: " +
                p1.display() + " " +
                p2.display() + " " +
                p3.display() +
                " Area=" + getArea() +
                " Perimeter=" + getPerimeter();
    }
}