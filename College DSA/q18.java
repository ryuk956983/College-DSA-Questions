import java.util.*;
public class q18 {

    public void find(int[] arr){
        Set<Integer> s1 = new HashSet<>();
        for(int i:arr){
            if(!s1.add(i)){
                System.out.println(i);
                return;
            }
        }
    }
    public void main(String[] args) {
        int[] input = {3,1,3,4,2};
        find(input);
       
        
    }
}
