import java.util.*;
public class q31 {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";

        char[] ch1 = s.toCharArray();
          char[] ch2 = t.toCharArray();
          Arrays.sort(ch1);
          Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1,ch2));


    }
}
