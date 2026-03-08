public class q21 {
    public static void main(String[] args) {
        int[] input = {2,3,-2,4};
        int res = Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            int temp = 1;
            for(int j=i;j<input.length;j++){
                temp*=input[j];
                res = Math.max(res,temp);
            }
            
        }

        System.out.println(res);
    }
}
