import java.util.*;
public class main12 {
    public void main(String[] args){
        int[] input = {1,2,4,7,7,5};
        Arrays.sort(input);
        int min = input[0];
        int max = input[input.length-1];
        int secmin  = Integer.MAX_VALUE;
        int secmax  = Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            if(input[i]==min || input[i]==max){
                continue;
            }
            secmin = Math.min(secmin,input[i]);
            secmax=Math.max(secmax,input[i]);
        }
        System.out.println("Second Smallest "+secmin);
         System.out.println("Second Larget "+secmax);
    }
}
