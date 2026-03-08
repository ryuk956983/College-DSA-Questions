public class q28 {
    public static void main(String[] args){
        String input = "UDDDUDUU";

        int valleys = 1;

        for(char ch:input.toCharArray()){
            if(ch=='U') valleys++;
            else valleys--;
        }

        System.out.println(Math.abs(valleys));
    }
}
