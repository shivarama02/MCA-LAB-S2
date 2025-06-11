import java.util.*;

public class Word {
    Scanner sc = new Scanner(System.in);
    String s;
    Word(){
        System.out.print("Enter a string: ");
        s = sc.nextLine();
    }
    void str_func(){
        System.out.println("Lower case: "+s.toLowerCase());
        System.out.println("Upper case: "+s.toUpperCase());
        System.out.println("Length: "+s.length());
        System.out.println("Substring(2): "+s.substring(2));
        System.out.println("Substring(2,6): "+s.substring(2, 6));
        System.out.println("Trim: "+s.trim());
        System.out.println("Index of ('o'): "+s.indexOf('o'));
        System.out.println("Index of ('o',10): "+s.indexOf('o',10));
        System.out.println("Concat(' CR7'): "+s.concat(" CR7"));
    }
}
class manupulation{
    public static void main(String[] args) {
        Word w = new Word();
        w.str_func();
    }
}
