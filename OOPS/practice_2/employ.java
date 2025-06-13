import java.util.*;
public class employ {
    Scanner sc = new Scanner(System.in);
    int eno;
    String ename;
    double esalary;
    employ(){
        System.out.println("Enter details of employee");
        System.out.print("Enter employee number: ");
        eno = sc.nextInt();
        System.out.print("Enter employee name: ");
        ename = sc.next();
        System.out.print("Enter employee salary: ");
        esalary = sc.nextDouble();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees to be register: ");
        int n = sc.nextInt();
        employ e[] = new employ[n];
        for(int i=0; i<n; i++){
            e[i] =  new employ();
        }
        int c=0;
        System.out.print("\nEnter employee number to search: ");
        int num = sc.nextInt();
        for(int i=0; i<n; i++){
            if(e[i].eno == num){
                System.out.println("Employee Name: "+e[i].ename+"\nsalary: "+e[i].esalary);
                c=1;
            }
        }
        if(c==0){
            System.out.println("Employee not registered");
        }
    }
}
