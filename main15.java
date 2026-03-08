public class main15 {
    public void main(String[] args){
        int[] input = {5,4,3,2,1};
        int i=0;
        int j=input.length-1;
        while(i<j){
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
            i++;
            j--;
        }
        for(int k:input) System.out.println(k);
    }
    
}
