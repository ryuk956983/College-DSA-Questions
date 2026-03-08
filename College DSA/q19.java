public class q19 {
    public void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m=3;
        int[] nums2 = {2,5,6};
        int n=3;
        int k=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[k++];
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums1.length-1;j++){
                if(nums1[j]>nums1[j+1]){
                    int temp  = nums1[j];
                    nums1[j] =  nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }

        for(int i:nums1) System.out.println(i);
    }
}
