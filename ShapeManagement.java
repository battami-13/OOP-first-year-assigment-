import java.util.Scanner;

public class ShapeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeList list = new ShapeList();

        int choice;

        do {
            System.out.println("\n1:Add 2:Remove 3:Get 4:Area/Perimeter 5:Display 6:Translate 7:Scale 0:Exit");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Choose shape: 1=Rectangle 2=Square 3=Circle 4=Triangle");
                    int type = sc.nextInt();

                    if (type == 1) {
                        System.out.println("Enter x y width length:");
                        int x = sc.nextInt();
                        int y = sc.nextInt();
                        int w = sc.nextInt();
                        int l = sc.nextInt();
                        list.addShape(new Rectangle(new Coordinates(x, y), w, l));
                    }

                    else if (type == 2) {
                        System.out.println("Enter x y side:");
                        int x = sc.nextInt();
                        int y = sc.nextInt();
                        int s = sc.nextInt();
                        list.addShape(new Square(new Coordinates(x, y), s));
                    }

                    else if (type == 3) {
                        System.out.println("Enter x y radius:");
                        int x = sc.nextInt();
                        int y = sc.nextInt();
                        int r = sc.nextInt();
                        list.addShape(new Circle(new Coordinates(x, y), r));
                    }

                    else if (type == 4) {
                        System.out.println("Enter x1 y1 x2 y2 x3 y3:");
                        Coordinates p1 = new Coordinates(sc.nextInt(), sc.nextInt());
                        Coordinates p2 = new Coordinates(sc.nextInt(), sc.nextInt());
                        Coordinates p3 = new Coordinates(sc.nextInt(), sc.nextInt());
                        list.addShape(new Triangle(p1, p2, p3));
                    }

                    System.out.println("Shape added!");
                    break;


                case 2:
                    System.out.println("Current Shapes:");
                    System.out.println(list.display());

                    System.out.println("Enter index (ONLY ONE number): ");

                    if (sc.hasNextInt()) {
                        int removePos = sc.nextInt();

                        if (list.removeShape(removePos) == null) {
                            System.out.println("Invalid index! Try again.");
                        } else {
                            System.out.println("Shape removed successfully.");
                        }
                    } else {
                        System.out.println("Invalid input! Enter a number only.");
                        sc.next();
                    }
                    break;

                case 3:
                    System.out.println("Enter position:");
                    int getPos = sc.nextInt();
                    Shape s = list.getShape(getPos);
                    if (s == null)
                        System.out.println("Invalid position!");
                    else
                        System.out.println(s.display());
                    break;

                case 4:
                    System.out.println("Enter position:");
                    int pos = sc.nextInt();
                    Shape shape = list.getShape(pos);
                    if (shape == null)
                        System.out.println("Invalid position!");
                    else {
                        System.out.println("Area: " + shape.getArea());
                        System.out.println("Perimeter: " + shape.getPerimeter());
                    }
                    break;

                case 5:
                    // ⭐ Show all shapes with index
                    System.out.println("Shapes in list:");
                    for (int i = 0; i < list.size(); i++) {
                        s = list.getShape(i);
                        System.out.println(i + ": " + s.getClass().getSimpleName());
                    }

                    // ⭐ Ask user choice
                    System.out.println("Enter index to display OR 7 to display ALL:");

                    if (sc.hasNextInt()) {
                        int choiceDisplay = sc.nextInt();

                        // ⭐ Display ALL
                        if (choiceDisplay == 7) {
                            System.out.println(list.display());
                        }

                        // ⭐ Display ONE shape
                        else {
                             s = list.getShape(choiceDisplay);

                            if (s == null) {
                                System.out.println("Invalid index!");
                            } else {
                                System.out.println(s.display());
                            }
                        }

                    } else {
                        System.out.println("Invalid input!");
                        sc.next();
                    }

                    break;


                case 6:
                    System.out.println("Enter dx (move in X): ");
                    int dx = sc.nextInt();

                    System.out.println("Enter dy (move in Y): ");
                    int dy = sc.nextInt();

                    System.out.println("All shapes translated!");
                    break;

                case 7:
                    System.out.println("Enter factor and sign (true=scale up, false=scale down):");
                    int factor = sc.nextInt();
                    boolean sign = sc.nextBoolean();
                    list.scale(factor, sign);
                    System.out.println("Shapes scaled.");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}