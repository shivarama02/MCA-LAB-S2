import java.util.*;
import java.io.*;
public class writeread {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter a file name: ");
            String filename = sc.nextLine();
            FileOutputStream fos = new FileOutputStream(filename,true);
    
            System.out.print("Enter text to insert: ");
            String text = sc.nextLine();
            fos.write(text.getBytes());
            
            System.out.print("Enter a file name: ");
            filename = sc.nextLine();
            FileInputStream fis = new FileInputStream((filename));
            byte[] b = new byte[fis.available()];
            fis.read(b);
            fis.close();

            String filecontent = new String(b);
            System.out.println("File name "+filename);
            System.out.println("File content: "+filecontent);
            sc.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}