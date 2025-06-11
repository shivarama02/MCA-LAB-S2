
import java.util.*;
public class Addcomplex {
    Scanner sc = new Scanner(System.in);
    int x, y;
    void input(int n){
        System.out.print("Enter real part of the number "+n+": ");
        x = sc.nextInt();
        System.out.print("Enter imaginary part of the number "+n+": ");
        y = sc.nextInt();
    }
    void add(Addcomplex b){
        Addcomplex c = new Addcomplex();
        c.x = x+b.x;
        c.y = y+b.y;
        System.out.println("("+x+"+i"+y+") + ("+b.x+"+i"+b.y+") = ("+c.x+"+i"+c.y+")");
    }
}
class complex{
    public static void main(String[] args) {
        
        Addcomplex a = new Addcomplex();
        Addcomplex b = new Addcomplex();

        a.input(1);
        b.input(2);

        a.add(b);
    }
}
