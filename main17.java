public class main17 {
    public static void main(String[] args) {
        int[] input = {9,6,4,2,3,5,7,0,1};
        int sum = (input.length*(input.length+1))/2;
        int arrSum = 0;
        for(int i:input){
            arrSum+=i;
        }
        System.out.println(sum-arrSum);
    }
}
