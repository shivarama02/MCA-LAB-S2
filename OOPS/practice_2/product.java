import java.util.*;
public class product {
    Scanner sc = new Scanner(System.in);
    String pname;
    int pcode, price;

    void details(){
        System.out.print("Enter product code : ");
        pcode = sc.nextInt();
        System.out.print("Enter product name: ");
        pname = sc.next();
        System.out.print("Enter product price: ");
        price = sc.nextInt();
    }
    void lowest_price(product a, product b){
        if(price < a.price && price < b.price){
            System.out.println("Product "+pname+" has lowest price");
        }
        else if(a.price < b.price){
            System.out.println("Product "+a.pname+" has lowest price");
        }
        else{
            System.out.println("Product "+b.pname+" has lowest price");
        }
    }
    public static void main(String[] args) {
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();
        p1.details();
        p2.details();
        p3.details();
        p1.lowest_price(p2, p3);
    }
}
