import java.util.*;
import java.io.*;
public class list {
    static void listfile(File dir){
        File[] flist = dir.listFiles();
        if(flist != null){
            for(File f: flist){
                System.out.println(f.getName()+", ");
                if(f.isDirectory()){
                    listfile(f);
                }
            }
        }
    }
    static void search(File dir, String name){
        File[] flist = dir.listFiles();
        if(flist != null){
            for(File f : flist){
                if(f.isFile() && f.getName().equals(name)){
                    System.out.println("File found at "+f.getAbsolutePath());
                    return;
                }
                else if(f.isDirectory()){
                    search(f, name);
                }
            }
        }
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a path or file: ");
            String path = sc.nextLine();
            
            File dir = new File(path);
            if(dir.exists() && dir.isDirectory()){
                listfile(dir);
            }
            System.out.print("Enter file name to search: ");
            String name= sc.nextLine();
            search(dir, name);
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
