import java.util.*;
public class main6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items");
        int items = scanner.nextInt();
        scanner.nextLine();
        String[] name = new String[items];
        double[] discount = new double[items];
        int min = 0;

        for(int i=0;i<items;i++){
            System.out.println("Enter the name of item: ");
            name[i] = scanner.nextLine();
            System.out.println("Enter the amount: ");
            double amount = scanner.nextDouble();
             System.out.println("Enter the discount: ");
            double dis = scanner.nextDouble();
            scanner.nextLine();
            discount[i] = amount*(dis/100.0);
            if(discount[min]>discount[i]){
                min=i;
            }
        }
        System.out.println("Item with minimum discout is: "+name[min]);


        scanner.close();
    }
}
