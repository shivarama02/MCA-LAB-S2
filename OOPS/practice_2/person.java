import java.util.*;
public class person {
    Scanner sc = new Scanner(System.in);
    String name, address;
    char gender;
    int age;
    person(int x){
        System.out.println("Enter details of teacher "+x);
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter gender(M/F/O): ");
        gender = sc.next().charAt(0);
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter address: ");
        address = sc.next();
    }
}
class employee extends person {
    Scanner sc = new Scanner(System.in);
    int empid;
    String companyname, qualification;
    double salary;
    employee(int x){
        super(x);
        System.out.print("Enter employee id: ");
        empid = sc.nextInt();
        System.out.print("Enter company name: ");
        companyname = sc.next();
        System.out.print("Enter qualification: ");
        qualification = sc.next();
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
    }
}
class teacher extends employee{
    Scanner sc = new Scanner(System.in);
    int teacherid, n;
    String dept, subject[];
    teacher(int x){
        super(x);
        System.out.print("Enter teacher id: ");
        teacherid = sc.nextInt();
        System.out.print("Enter department: ");
        dept = sc.next();
        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();
        subject = new String[n];
        System.out.println("Enter subjects: ");
        for(int i=0; i<n; i++){
            subject[i] = sc.next();
        }
    }
    void display(int x){
        System.out.println("\nTeacher "+x+" Details");
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Employee id: "+empid);
        System.out.println("Teacher id: "+teacherid);
        System.out.println("Company name: "+companyname);
        System.out.println("Department: "+dept);
        System.out.println("Qualification: "+qualification);
        System.out.println("Salary: "+salary);
        System.out.println("Subjects: ");
        for(int i=0; i<n; i++){
            System.out.print(subject[i]+", ");
        }
    }
}
class teacher_main{
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
        sc.close();
    }
}
