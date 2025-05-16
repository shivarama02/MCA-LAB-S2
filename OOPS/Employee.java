import java.util.*;

public class Employee{
    Scanner sc = new Scanner(System.in);
    int empid;
    String ename, address;
    double salary;
    Employee(int x){
        System.out.print("              Enter details of teacher "+x+": ");
        System.out.print("\nEnter employee id: ");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name: ");
        ename = sc.nextLine();
        System.out.print("Enter employee address: ");
        address = sc.nextLine();
        System.out.print("Enter employee salary: ");
        salary = sc.nextDouble();
    }
}
class Teacher extends Employee{
    Scanner sc = new Scanner(System.in);
    int no;
    String dept, sub[];
    Teacher(int x){
        super(x);
        System.out.print("Enter department: ");
        dept = sc.next();
        System.out.print("Enter no. of subject taught: ");
        no = sc.nextInt();
        sub = new String[no];
        System.out.println("Enter list of subjects: ");
        for(int i=0; i<no; i++){
            sub[i] = sc.next();
        }
    }
    void Display(int n){
        System.out.println();
        System.out.println("              Teacher "+n+" Details");
        System.out.println("Employee id: "+empid);
        System.out.println("Emplyee name: "+ename);
        System.out.println("Employee address: "+address);
        System.out.println("Department: "+dept);
        System.out.print("Subjects: ");
        for(int i=0; i<no; i++){
            System.out.print(sub[i]+" ");
        }
    }
}
class tchr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of teachers: ");
        int n = sc.nextInt();

        Teacher t[] = new Teacher[n];

        for(int i=0;i<n;i++) 
            t[i]=new Teacher(i+1); 
        for(int i=0;i<n;i++)             
            t[i].Display(i+1);
        sc.close();
    }
}