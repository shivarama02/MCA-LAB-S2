import java.util.*;
public class addmatrix {
    Scanner sc = new Scanner(System.in);
    int m, n, matrix[][];
    addmatrix(){
        System.out.print("Enter size of matrix: ");
        m=sc.nextInt();
        n=sc.nextInt();
        matrix = new int[m][n];
        System.out.println("Enter value of matrix :");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    void add(addmatrix b){
        if(m != b.m || n != b.n){
            System.out.println("Addition of matrix not possible.");
        }
        else{
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    matrix[i][j] += matrix[i][j];
                }
            }
            System.out.println("Sum of 2 matrixes are: ");
            display();
        }
    }
    void display(){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        addmatrix n1=new addmatrix();
        addmatrix n2=new addmatrix();
        n1.add(n2);
    }
}
