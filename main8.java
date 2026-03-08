//Matrix Rotation by 90 Degrees:

public class main8 {
    public void main(String[] args){
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] rotatedMatrix = new int[input.length][input[0].length];
        for(int i=0;i<input[0].length;i++){
            for(int j=input.length-1;j>=0;j--){
                rotatedMatrix[i][(input.length-1)-j] = input[j][i];
            }
        }

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[0].length;j++){
                System.out.print(rotatedMatrix[i][j]);
            }
            System.out.println();
        }

    }
}
