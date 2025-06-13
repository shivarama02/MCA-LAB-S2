import java.util.*;
import java.io.*;
public class evenorodd {
    public static void main(String[] args) throws Exception{
        

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number file path  : " );
            String numbers=sc.nextLine();
            BufferedReader rd=new BufferedReader(new FileReader(numbers));

            BufferedWriter odd=new BufferedWriter(new FileWriter("odd.txt"));
            BufferedWriter even=new BufferedWriter(new FileWriter("even.txt"));

            String line;
            while((line=rd.readLine()) != null){
                line = line.trim(); // remove any extra spaces or newlines

                if (line.isEmpty()) {
                    continue; // skip empty lines
                }
                int num=Integer.parseInt(line);
                if(num%2==0){

                    even.write(String.valueOf(num));
                    even.newLine();
                }
                else{

                    odd.write(String.valueOf(num));
                    odd.newLine();
                }
            }

            sc.close();
            rd.close();
            odd.close();
            even.close();



    }
}