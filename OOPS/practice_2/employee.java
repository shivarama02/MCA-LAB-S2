import java.util.*;
public class employee {
    Scanner sc = new Scanner(System.in);
    int empid;
    String name, address;
    double salary;
    employee(int x){
        System.out.println("Enter Details of teacher "+x);
        System.out.print("Enter employee id: ");
        empid = sc.nextInt();
        System.out.print("Enter employee name: ");
        name = sc.next();
        System.out.print("Enter employee address: ");
        address = sc.next();
        System.out.print("Enter employee salary: ");
        salary = sc.nextDouble();
    }
}
class teacher extends employee{
    Scanner sc = new Scanner(System.in);
    String dept, subject[];
    int n;
    teacher(int x){
        super(x);
        System.out.print("Enter department: ");
        dept = sc.next();
        System.out.print("Enter no. of subjects: ");
        n = sc.nextInt();
        subject = new String[n];
        System.out.print("Enter subjects: ");
        for(int i=0; i<n; i++){
            subject[i] = sc.next();
        }
    }
    void display(int x){
        System.out.println("Teacher "+x+"Details");
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee name: "+name);
        System.out.println("Employee address: "+address);
        System.out.println("Employee salary: "+salary);
        System.out.println("Department: "+dept);
        System.out.println("Subjects: ");
        for(int i=0; i<n; i++){
            System.out.println(subject[i]+", ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of techers: ");
        int n = sc.nextInt();
        teacher t[] = new teacher[n];
        for(int i=0; i<n; i++){
            t[i] = new teacher(i+1);
        }
        for(int i=0; i<n; i++){
            t[i].display(i+1);
        }
    }
}