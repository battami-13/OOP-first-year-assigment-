public abstract class Shape {
    protected Coordinates position;
    protected int sides;

    public Shape(int sides, Coordinates position) {
        this.sides = sides;
        this.position = position;
    }

    public Coordinates getCoordinates() { return position; }
    public int getSides() { return sides; }

    public void setCoordinates(Coordinates c) {
        position = c;
    }

    public void translate(int dx, int dy) {
        position.translate(dx, dy);
    }

    public abstract void scale(int factor, boolean sign);
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String display();
}