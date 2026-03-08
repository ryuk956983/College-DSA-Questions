
import java.util.*;

public class main16 {

    public void largestElement(int[] arr,int k){
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        for(int i:arr){
            p1.add(i);
            if(p1.size()>k) p1.poll();
        }

        System.out.println(p1.peek());
    }
    public void main(String[] args){
        int[] input ={3,2,1,5,6,4};
        int k=2;
        largestElement(input,k);
    }
}
