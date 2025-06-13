import java.io.*;
import java.util.*;

public class copypaster {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter s file name : ");
            String source=sc.nextLine();
            BufferedReader reader = new BufferedReader(new FileReader(source));
            System.out.println("Enter d file name : ");
            String dest=sc.nextLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(dest));
            String line;
            while((line=reader.readLine()) != null)
            {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();
            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}