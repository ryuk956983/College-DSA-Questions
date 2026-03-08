import java.util.*;
public class q38 {
    public static void substring(String s){
        Set<Character> h1 = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int i=0;
        for(char ch:s.toCharArray()){
            if(h1.contains(ch)){
             max= Math.max(max,h1.size());
            while(h1.contains(ch)){
                h1.remove(s.charAt(i));
                i++;
            }
            }
            h1.add(ch);
            
        }
        System.out.println(max);

    }
    public void main(String[] args) {
        String input = "pwwkew";
        substring(input);

        
    }
}
