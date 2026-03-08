
import java.util.*;

public class main10 {

    public void main(String[] args) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        int[] input = {1,2,3,3,4,1,4,5,1,2};
        for (int i : input) {
                h1.put(i,h1.getOrDefault(i,0)+1);
        }
        for(int i:h1.keySet()){
            System.out.println(i +" occurs " +h1.get(i) +" times");
        }
    }
}
