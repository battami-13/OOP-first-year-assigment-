import java.util.ArrayList;

public class ShapeList {
    private ArrayList<Shape> list = new ArrayList<>();

    public void addShape(Shape s) {
        list.add(s);
    }

    public Shape getShape(int pos) {
        if (pos >= 0 && pos < list.size())
            return list.get(pos);
        return null;
    }

    public Shape removeShape(int pos) {
        if (pos >= 0 && pos < list.size())
            return list.remove(pos);
        return null;
    }

    public void translateShapes(int dx, int dy) {
        for (Shape s : list)
            s.translate(dx, dy);
    }

    public void scale(int factor, boolean sign) {
        for (Shape s : list)
            s.scale(factor, sign);
    }

    public double area(int pos) {
        return getShape(pos).getArea();
    }

    public double perimeter(int pos) {
        return getShape(pos).getPerimeter();
    }

    public int size() {
        return list.size();
    }


    public String display() {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += i + ": " + list.get(i).display() + "\n";
        }
        return result;
    }
}
