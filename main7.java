
import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = Math.abs(scanner.nextInt());
        if(input==0){
            System.out.println("No Factors");
            return;
        }

        for(int i=1;i<=input;i++){
            if(input%i==0) System.out.println(i);
        }



        scanner.close();
    }
}
