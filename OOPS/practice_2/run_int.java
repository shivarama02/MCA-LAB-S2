import java.util.*;
class fibonacci implements Runnable{
    int n;
    fibonacci(int limit){
        n=limit;
    }
    public void run(){
        int a=0, b=1, c;
        for(int i=1; i<n; i++){
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;
        }
    }
}
class even implements Runnable{
    int start, end;
    even(int a, int b){
        start=a;
        end=b;
    }
    public void run(){
        for(int i=start; i<=end; i++){
            if(i%2==0){
                System.out.println("Even: "+i);
            }
        }
    }
}

public class run_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of fibonacci series: ");
        int n = sc.nextInt();

        System.out.print("Enter starting and ending range of even numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Thread f = new Thread(new fibonacci(n));
        Thread e = new Thread(new even(a, b));

        f.start();
        e.start();
    }
}
