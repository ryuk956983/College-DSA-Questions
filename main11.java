public class main11 {
    public void main(String[] args){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        int top=0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int i=0;

        while(top<bottom && left<right){
            while(left<=right){
                System.out.println(matrix[top][left++]);
            }
            top++;
            left--;
            while(top<bottom){
                System.out.println(matrix[top++][right]);
            }

            while(left>i){
                System.out.println(matrix[bottom][left--]);
            }
            
            while(top>i){
                System.out.println(matrix[top--][left]);
            }
            i++;
            top=i;
            left=i;
            right=matrix[0].length-1-i;
            bottom=matrix.length-1-i;
            

        }
    }
}
