//Binary Search

public class main9 {
    public void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9};
        int target = 4;
        int i=0;
        int j=array.length-1;

        while(i<j){
            int mid = j-i/2;
            if(array[mid]>target){
                j=mid-1;
            }else if(array[mid]<target){
                i=mid+1;
            }else{
                System.out.println(mid);
                return;
            }
            

        }
        System.out.println("Not Found");

    }
}
