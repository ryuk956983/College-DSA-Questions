public class q34 {

    public void isPalindrome(String s){
        int i=0,j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println(false);
                return;
            }
            i++;
            j--;
        }
        System.out.println(true);
    }
    public void main(String[] args){
        String input = "madam";
        isPalindrome(input);

    }
}
