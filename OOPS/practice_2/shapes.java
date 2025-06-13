import java.util.*;
public interface shapes {
    public void area();
    public void perimeter();
}
class circle implements shapes{
    double r;
    circle(double r){
        this.r =r;
    }
    public void area(){
        System.out.println("Area of circle: "+String.format("%.2f", (3.14*r*r)));
    }
    public void perimeter(){
        System.out.println("Perimeter of circle: "+String.format("%.2f", (2*3.14*r)));
    }
}
class rectangle implements shapes{
    double l, b;
    rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }
    public void area(){
        System.out.println("Area of rectangle: "+String.format("%.2f", (l*b)));
    }
    public void perimeter(){
        System.out.println("Perimter of rectangle: "+String.format("%.2f", (2*(l+b))));
    }
}
class circle_rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        while(true){
            System.out.print("1.Circle\n2.Rectangle\n3.Exit\nChoose an choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double r = sc.nextDouble();
                    circle c = new circle(r);
                    c.area();
                    c.perimeter();
                    break;
                case 2:
                    System.out.print("Enter length and breadth of rectangle: ");
                    double l = sc.nextDouble();
                    double b = sc.nextDouble();
                    rectangle r1 = new rectangle(l, b);
                    r1.area();
                    r1.perimeter();
                    break;
                case 3:
                    System.out.print("Exting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Option!");
            }
        }
    }
}