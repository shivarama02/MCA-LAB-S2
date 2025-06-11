import java.util.*;

public class product1 {
    String pname;
    int pcode, price;

    product1(int pcode, String pname, int price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<product1> products = new ArrayList<>();
        List<product1> cart = new ArrayList<>();

        // Sample products
        products.add(new product1(101, "Laptop", 50000));
        products.add(new product1(102, "Phone", 20000));
        products.add(new product1(103, "Headphones", 1500));

        int ch;

        while (true) {
            System.out.println("\n------------------------------------------------");
            System.out.println("                 Shopping Cart                  ");
            System.out.println("------------------------------------------------");
            System.out.println("1. View products");
            System.out.println("2. Add to cart");
            System.out.println("3. View cart");
            System.out.println("4. Delete from cart");
            System.out.println("5. Total price");
            System.out.println("6. Place Order");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("\nAvailable Products:");
                    for (product1 p : products) {
                        System.out.println("Code: " + p.pcode + ", Name: " + p.pname + ", Price: ₹" + p.price);
                    }
                    break;

                case 2:
                    System.out.print("Enter product code to add to cart: ");
                    int addCode = sc.nextInt();
                    boolean added = false;
                    for (product1 p : products) {
                        if (p.pcode == addCode) {
                            cart.add(p);
                            System.out.println(p.pname + " added to cart.");
                            added = true;
                            break;
                        }
                    }
                    if (!added) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3: // NEW CASE: View Cart
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty.");
                    } else {
                        System.out.println("\nItems in your cart:");
                        for (product1 p : cart) {
                            System.out.println("Code: " + p.pcode + ", Name: " + p.pname + ", Price: ₹" + p.price);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter product code to delete from cart: ");
                    int delCode = sc.nextInt();
                    boolean removed = false;
                    Iterator<product1> it = cart.iterator();
                    while (it.hasNext()) {
                        product1 p = it.next();
                        if (p.pcode == delCode) {
                            it.remove();
                            System.out.println(p.pname + " removed from cart.");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Product not found in cart.");
                    }
                    break;

                case 5:
                    int total = 0;
                    for (product1 p : cart) {
                        total += p.price;
                    }
                    System.out.println("Total Price: ₹" + total);
                    break;

                case 6:
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty!");
                    } else {
                        System.out.println("\n------------- Order Summary / Bill -------------");
                        total = 0;
                        for (product1 p : cart) {
                            System.out.println("Product: " + p.pname + " | Code: " + p.pcode + " | Price: ₹" + p.price);
                            total += p.price;
                        }
                        double gst = total * 0.18;
                        double grandTotal = total + gst;

                        System.out.println("-----------------------------------------------");
                        System.out.printf("Subtotal             : ₹%.2f\n", (double) total);
                        System.out.printf("GST @ 18%%            : ₹%.2f\n", gst);
                        System.out.printf("Total Amount Payable : ₹%.2f\n", grandTotal);
                        System.out.println("-----------------------------------------------");
                        System.out.println("Thank you! Your order has been placed.");

                        cart.clear();
                    }
                    break;


                case 7:
                    System.out.println("Thank you for shopping with us!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
