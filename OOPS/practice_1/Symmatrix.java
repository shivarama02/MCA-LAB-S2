import java.util.*;

public class Symmatrix {
    Scanner sc = new Scanner(System.in);
    int m,n;
    int matrix[][];
    int c=0;
    void matrix(){
        System.out.print("Enter the size of the matrix (m n): ");
        m = sc.nextInt();
        n = sc.nextInt();
        matrix = new int[m][n];
        System.out.println("Enter valus of the matrix: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    void transpose(){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] != matrix[j][i]){
                    c=1;
                    break;
                }
            }
        }
        if(c!=1){
            System.out.println("The matrix is symmetric");
        }
        else{
            System.out.println("The matrix is not symmetric");
        }
    }
}
class symmetric{
    public static void main(String[] args) {
        
        Symmatrix a = new Symmatrix();
        a.matrix();
        a.transpose();
    }
}
