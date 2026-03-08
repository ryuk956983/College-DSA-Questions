public class q20 {

    public int[] rotate(int[] nums,int k){
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[(i+k)%nums.length] = nums[i];
        }
        return ans;
        
    }
    public void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7};
        int k=3;
        input = rotate(input,k);
        
        for(int i:input) System.out.println(i);
    }
}
