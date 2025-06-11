import java.util.*;

public class Addmatrix {
    Scanner sc = new Scanner(System.in);
    int m,n;
    int matrix[][];

    Addmatrix(int x){
        System.out.print("Enter the size of matrix "+x+"(m n): ");
        m = sc.nextInt();
        n = sc.nextInt();
        matrix = new int[m][n];
        System.out.println("Enter values for matrix "+x+": ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    void add(Addmatrix b){
        if(m!=b.m || n!=b.n){
            System.out.println("Adiition of matrix not possible!");
        }
        else{
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    matrix[i][j] += b.matrix[i][j];
                }
            }
            System.out.println("The sum of matrix is:- ");
            this.Display();
        }
    }
    void Display(){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class matrix {
    public static void main(String[] args) {
        Addmatrix a = new Addmatrix(1);
        Addmatrix b = new Addmatrix(2);
        a.add(b);
    }
}
