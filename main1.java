//Check if a Number is Prime:

public class main1{
    public void isPrime(int num){
        if(num<=1){
            System.out.println(num+" is not a prime number.");
            return;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println(num+" is not a prime number.");
                return;
            }
        }
        System.out.println(num+" is a prime number.");
    }
    public void main(String[] args){
        isPrime(29);
    }
}