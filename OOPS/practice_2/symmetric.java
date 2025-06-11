import java.util.*;
public class symmetric {
    Scanner sc = new Scanner(System.in);
    int m, n, matrix[][];
    int trans[][], c=0;
    symmetric(){
        System.out.print("Enter size of the matrix: ");
        m=sc.nextInt();
        n=sc.nextInt();
        matrix = new int[m][n];
        System.out.println("Enter values of matrix: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        trans = new int[n][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                trans[j][i] = matrix[i][j];
            }
        }
    }
    void display(){
        System.out.println("Original matrix");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+ " "); 
            }
            System.out.println();
        }
        System.out.println("Tranpose matrix");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
    void checksymmetric(){
        if(m != n){
            System.out.println("Matrix is not symmetric (not a square matrix)");
        }for(int i=0; i<m; i++){
            for(int j=0; j<n;){
                if(matrix[i][j] == trans[i][j]){
                    c=1;
                    break;
                } 
                else{
                    c=0;
                    break;
                }
            }
        }
        if(c==1){
            System.out.println("Marrix is symmetic.");
        }
        else{
            System.out.println("Matrix is not symmetric.");
        }
    }
    public static void main(String[] args) {
        symmetric a=new symmetric();
        a.display();
        a.checksymmetric();
    }

}
