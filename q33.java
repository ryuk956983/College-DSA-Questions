import java.util.*;
public class q33 {
    public void unique(String s){
        HashMap<Character,Integer> h1 = new HashMap<>();
        for(char ch:s.toCharArray()) h1.put(ch,h1.getOrDefault(ch,0)+1);

        for(int i=0;i<s.length();i++){
            if(h1.get(s.charAt(i))==1){
                System.out.println(s.charAt(i));
                return;
            }
        }

        System.out.println(-1);
    }
    public void main(String[] args){
        String input = "swiss";
        unique(input);
    }
    
}
