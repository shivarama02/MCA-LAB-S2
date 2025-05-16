import java.util.*;

public class Product_lowest {
    String pname,pcode;
    int price;
    void details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        pname = sc.next();
        System.out.print("Enter Product Code : ");
        pcode = sc.next();
        System.out.print("Enter Product Price: ");
        price = sc.nextInt();
        sc.close();
    }
    static void Lowest(Product_lowest a, Product_lowest b, Product_lowest c){
        if(a.price < b.price && a.price < c.price){
            System.out.println(a.pname+" Is the lowest product!");
        }
        else if(b.price < a.price && b.price < c.price){
            System.out.println(b.pname+" is the lowest product!");
        }
        else{
            System.out.println(c.pname+" is the lowest product!");
        }
    }
}
class Compare{
    public static void main(String[] args) {
        
        Product_lowest p1 = new Product_lowest();
        Product_lowest p2 = new Product_lowest();
        Product_lowest p3 = new Product_lowest();

        p1.details();
        p2.details();
        p3.details();

        Product_lowest.Lowest(p1, p2, p3);
    }
}