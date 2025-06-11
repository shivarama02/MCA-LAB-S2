public class Product {

    int pro_code;
    String pro_name;
    double price;

    Product(int pro_code,String pro_name,double price)
    {
        this.pro_code=pro_code;
        this.pro_name=pro_name;
        this.price=price;
    }
    public static void main(String[] args)
    {
        Product p[]=new Product[5];
        
        p[0]= new Product(123, "Iphone 15 Pro Max", 99000);
        p[1]= new Product(203, "Iphone 16 Pro Max", 140000);
        p[2]= new Product(263, "Iphone 16", 89000);
        p[3]= new Product(293, "Iphone 16 Pro", 120000);
        p[4]= new Product(234, "Iphone 15", 57000);

        for(int i=0;i<p.length;i++)
        {
            System.out.print("Product code: "+p[i].pro_code);
            System.out.print("   Product price: "+p[i].price);
            System.out.print("   Product name: "+p[i].pro_name);
            System.out.println();

        }

        Product minProduct=p[0];
        
        for(int i=1;i<p.length;i++)
        {
            //find the lowest price
            if(p[i].price < minProduct.price)
            {
                minProduct=p[i];
            }
        }
        System.out.println("The lowest price Product ");
        System.out.print("Product code: "+minProduct.pro_code);
        System.out.print("   Product price: "+minProduct.price);
        System.out.print("   Product name: "+minProduct.pro_name);
    }

    
}