import java.util.*;
public class q29{

    public void reduce(String s){
        HashMap<Character,Integer> h1 = new HashMap<>();
        StringBuilder sb  = new StringBuilder();
        for(char ch:s.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
       for(char ch:h1.keySet()){
        sb.append(ch);
        sb.append(h1.get(ch));
       }

       System.out.println(sb.toString());

    }
    public void main(String[] args){
        String input = "aabbbbeeeeffggg";
        reduce(input);
        
        

    }
}
