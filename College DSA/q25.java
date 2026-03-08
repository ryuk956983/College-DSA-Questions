import java.util.*;
public class q25 {

    public void intersection(int[] nums1,int[] nums2){
        HashMap<Integer,Integer> h1 = new HashMap<>();
       List<Integer> l1 = new ArrayList<>();
        for(int i:nums1){
            h1.put(i,h1.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            if(h1.containsKey(i) && h1.get(i)>0){
                l1.add(i);
                h1.put(i,h1.get(i)-1);
            }
        }

        System.out.println(l1);


    }
    public void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        intersection(nums1,nums2);

    }
}
