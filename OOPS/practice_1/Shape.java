import java.util.*;

public interface Shape{
    public void area();
    public void perimeter();
}

class Circle implements Shape{
    double radius;
    Circle(double r){
        radius= r;
    }
    public void area(){
        System.out.println("Area of circle: "+String.format("%.2f", (3.14*radius*radius)));
    }
    public void perimeter(){
        System.out.println("Perimeter od circle: "+String.format("%.2f", (2*3.14*radius)));
    }
}
class Rectangle implements Shape{
    double length, breadth;
    Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    public void area(){
        System.out.println("Area of rectangle: "+String.format("%.2f",(length*breadth)));
    }
    public void perimeter(){
        System.out.println("Perimeter of rectangle: "+String.format("%.2f",(2*(length+breadth))));
    }
}
class circle_rect{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.print("\n1.Circle\n2.Rectangle\n3.Exit\nEnter choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double r = sc.nextInt();
                    Circle c = new Circle(r);
                    c.area();
                    c.perimeter();
                    break;
                case 2:
                    System.out.print("Enter length and breadth of the ractangle: ");
                    double l = sc.nextInt();
                    double b = sc.nextInt();
                    Rectangle r1 = new Rectangle(l, b);
                    r1.area();
                    r1.perimeter();
                    break;
                case 3:
                    System.out.println("Exting....");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(ch!=3);
        sc.close();
    }
}