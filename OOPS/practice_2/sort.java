import java.util.*;
public class sort {
    Scanner sc = new Scanner(System.in);
    String s[];
    int n;
    sort(){
        System.out.print("Enter no. of Strings: ");
        n = sc.nextInt();
        s = new String[n];
        System.out.print("Enter "+n+" Strings: ");
        for(int i=0; i<n; i++){
            s[i] = sc.next();
        }
    }
    void sorting(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(s[j].compareTo(s[j+1])>0){
                    String temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
    }
    void display(){
        System.out.print("[ ");
        for(int i=0; i<n; i++){
            System.out.print(s[i]+", ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        sort str = new sort();
        System.out.println("    Original string array: ");
        str.display();
        str.sorting();
        System.out.println("\n    Sorted string array: ");
        str.display();
    }
}
