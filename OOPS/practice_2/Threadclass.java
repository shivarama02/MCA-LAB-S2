import java.util.*;
class multiple5 extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println(i+" x 5 = "+i*5);
        }
    }
}
class prime extends Thread{
    int n;
    prime(int limit){
        n=limit;
    }
    int isprime(int num){
        if(num<2)return 0;
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                return 0;
            }
        }
        return 1;
    }
    public void run(){
        for(int i=1; i<=n; i++){
            if(isprime(i)==1){
                System.out.println("prime: "+i);
            }
        }
    }
}
public class Threadclass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        multiple5 m = new multiple5();
        System.out.print("Enter limit for generating prime: ");
        int n = sc.nextInt();
        prime p = new prime(n);
        m.start();
        p.start();
    }
}