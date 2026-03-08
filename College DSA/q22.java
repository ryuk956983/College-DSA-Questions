public class q22 {

    public void pairs(int[] arr, int target) {
        int count=0;

        for (int i=0;i<arr.length-1;i++) {
           for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target)count++;
           }

        }
        System.out.println(count);

    }

    public void main(String[] args) {

        int[] input = {1,1,1,1};
        int target = 2;
        pairs(input,target);
    }
}
