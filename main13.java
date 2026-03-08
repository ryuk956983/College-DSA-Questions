import java.util.*;
public class main13 {
    public void main(String[] args){
        List<List<Integer>> ans = new ArrayList<>();
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        for(int i=0;i<input.length;i++){
            int j=i;
            while(j<input.length-1 && input[i][1]>=input[j+1][0]) j++;
            List<Integer> l1  = new ArrayList<>();
            l1.add(input[i][0]);
            l1.add(input[j][1]);
            ans.add(l1);
            i=j;
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i));
      
        }
    }
}
