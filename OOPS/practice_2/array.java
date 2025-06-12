import java.util.*;
public class array {
    Scanner sc = new Scanner(System.in);
    int arr[], n, ele, c=0;
    array(){
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.print("Enter elements to the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements:  [ ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print("]");
    }
    void search(){
        System.out.print("\nEnter element to be searched: ");
        ele = sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i] == ele){
                c=1;
            }
        }
        if(c==1){
            System.out.println(ele+" found in array.");
        }
        else{
            System.out.println(ele+" not founnd in array.");
        }
    }
    public static void main(String[] args) {
        array a = new array();
        a.search();
    }
}
