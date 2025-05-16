import java.util.*;

public class Searcharray {
    Scanner sc = new Scanner(System.in);
    int arr[],size;
    void inputarray(){
        System.out.print("Enter the size of an array: ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array: [ ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
    void Search(){
        int c=0,index=0;
        System.out.print("Enter the element to search: ");
        int n = sc.nextInt();
        for(int i=0; i<size; i++){
            if(arr[i]==n){
                c=1;
                index += index+i;
                break;
            }
        }
        if(c==1){
            System.out.println(n+" is found at index "+index);
        }
        else{
            System.out.println(n+" is not found in array!");
        }
    }
}
class array{
    public static void main(String[] args) {
        Searcharray s = new Searcharray();
        s.inputarray();
        s.Search();
    }
}
