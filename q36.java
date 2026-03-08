
public class q36 {

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < input[0].length(); j++) {
            for (int i = 0; i < input.length - 1; i++) {
           
                if(j>=input[i+1].length() || input[i].charAt(j)!=input[i+1].charAt(j)){
                    break;
                }else{
                    if(i==input.length-2){
                        sb.append(input[i].charAt(j));
                    }
                }
                
            }
        }
        System.out.println(sb.toString());
    }

}
