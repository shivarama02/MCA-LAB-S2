import java.util.*;
public class complex {
    Scanner sc = new Scanner(System.in);
    int x, y;
    complex(){
        System.out.print("Enter real1 part of the number: ");
        x=sc.nextInt();
        System.out.print("Enter imaginary part of the number: ");
        y=sc.nextInt();
    }
    void add(complex b){
        // complex c=new complex();
        int c, d;
        c = x+b.x;
        d = y+b.y;
        System.out.printf("\n %d + i%d +\n %d + i%d \n------------------\n %d + i%d ", x, y, b.x, b.y, c, d);
    }
    public static void main(String[] args) {
        complex a=new complex();
        complex b=new complex();
        // a.input();
        // b.input();
        a.add(b);
    }
}
