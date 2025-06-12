import java.util.*;
public class CPU {
    Scanner sc = new Scanner(System.in);
    int price;
    class processor{
        int no_of_cores;
        String manufacturer;
        processor(){
            System.out.print("Enter no. of cores in the processor: ");
            no_of_cores = sc.nextInt();
            System.out.print("Enter manufacturer of the processor: ");
            manufacturer = sc.next();
        }
    }
    static class RAM{
        Scanner sc = new Scanner(System.in);
        int memory;
        String manufacturer;
        RAM(){
            System.out.print("Enter memory capacity of RAM: ");
            memory = sc.nextInt();
            System.out.print("Enter manufacturer of the RAM: ");
            manufacturer = sc.next();
        }
    }
    public static void main(String[] args) {
        CPU c = new CPU();
        CPU.processor p = c.new processor();
        CPU.RAM r = new CPU.RAM();

        c.price = 2500+(p.no_of_cores*20)+(r.memory*15);

        System.out.println("Processor: \n no. of cores: "+p.no_of_cores+"\nManufacturer: "+p.manufacturer);
        System.out.println("RAM: \nmemory: "+r.memory+"\nManufacturer: "+r.manufacturer);
        System.out.println("CPU Price: "+c.price);
    }
}
