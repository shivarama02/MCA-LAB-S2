import java.util.*;
public class shape {
    void area(double r){
        System.out.println("Area of circle: "+String.format("%.2f",3.14*r*r));
    }
    void area(float r){
        System.out.println("Area of square: "+(r*r));
    }
    void area(double l, double b){
        System.out.println("Area of rectangle: "+(l*b));
    }
    void area(float b, float h){
        System.out.println("Area of triangle: "+String.format("%.2f",0.5*b*h));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shape s = new shape();
        while(true){
            System.out.print("1.Area od circle\n2.Area of square\n3.Area of rectangle\n4.Area of triangle\n5.Exit\nChoose an option: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double r=sc.nextDouble();
                    s.area(r);
                    break;
                case 2:
                    System.out.print("Enter length of side of square: ");
                    float n=sc.nextFloat();
                    s.area(n);
                    break;
                case 3:
                    System.out.print("Enter length and breadth of rectangle: ");
                    double l=sc.nextDouble();
                    double b=sc.nextDouble();
                    s.area(l, b);
                    break;
                case 4:
                    System.out.print("Enter breadth and height of triangle: ");
                    float a=sc.nextFloat();
                    float h=sc.nextFloat();
                    s.area(a, h);
                    break;
                case 5:
                    System.out.print("Exiting...");
                    System.exit(0);
                default:
                    System.out.print("Invalid option!");
            }
        }
    }
}
