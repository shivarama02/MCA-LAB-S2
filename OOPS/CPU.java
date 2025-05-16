import java.util.*;

public class CPU {
    Scanner sc = new Scanner(System.in);
    int price;
    class processor{
        int core;
        String MFG;
        processor(){
            System.out.print("Enter no. of core in the processor: ");
            core = sc.nextInt();
            System.out.print("Enter manufacturer of the processor: ");
            MFG = sc.next();
        }
    }
    static class RAM{
        Scanner sc = new Scanner(System.in);
        int memory;
        String MFG;
        RAM(){
            System.out.print("Enter memory capacity of the RAM: ");
            memory = sc.nextInt();
            System.out.print("Enter manufacturer of the RAM: ");
            MFG = sc.next();
        }
    }
}
class innerclass{
    public static void main(String[] args) {

        CPU c = new CPU();
        CPU.processor p = c.new processor();
        CPU.RAM r = new CPU.RAM();
    
        c.price=2500+(p.core*20)+(r.memory*15);
    
        System.out.println("\nProcessor:\n  No:of Cores : "+p.core+"\n  Manufacturer: "+p.MFG);
        System.out.println("\nRAM:\n   Memory Capacity : "+r.memory+" GB\n  Manufacturer: "+r.MFG);
        System.out.println("\nCPU Price: "+c.price); 
    }
    }