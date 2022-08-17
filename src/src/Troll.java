import java.util.*;
public class Troll {
    public static void main(String args[]){
        Scanner kbd = new Scanner(System.in);
        System.out.print("Comment: ");
        System.out.println(disemvowel(kbd.nextLine()));
    }
    public static String disemvowel(String str) {
        str = (str.replaceAll("[aeiou]", ""));
        return str;
    }
}