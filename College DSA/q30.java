public class q30 {


    public void main(String[] args) {
        String input = "Capgemini";
        int i =0;
        int j=input.length()-1;
        char[] arr = input.toCharArray();

        while(i<j){
            char temp= arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        input = new String(arr);

        System.out.println(input);
    
    }
}
