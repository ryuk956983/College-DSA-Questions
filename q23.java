public class q23 {
    public static void main(String[] args) {
        int[] input = {0,1,0,3,12};
        int i =0;
        int j=1;

        while(j<input.length){
            if(input[j]!=0 && input[i]==0){
                int temp = input[j];
                input[j] = input[i];
                input[i] = temp;
                i++;
                
            }
            j++;
            
            
        }

        for(int l:input) System.out.println(l);

    }
}
