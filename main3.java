import java.util.Scanner;

public class main3{
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of semester:");
        int sem = scanner.nextInt();
        int[] subjects  = new int[sem];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<sem;i++){
            System.out.println("Enter no. of subjects in "+(i+1)+" semester: ");
            subjects[i] = scanner.nextInt();
            max = Math.max(subjects[i],max);
        }
        int[][] marks = new int[sem][max];
        int[] maxarr = new int[sem];

        for(int i=0;i<sem;i++){
            System.out.println("Marks obtained in "+(i+1)+" semester: ");
            for(int j=0;j<subjects[i];j++){
                marks[i][j] = scanner.nextInt();
                maxarr[i] = Math.max(maxarr[i],marks[i][j]);
            }
        }
        for(int i=0;i<sem;i++){
            System.out.println("Maximun mark in "+(i+1)+" semester: "+maxarr[i]);
        }
        


        scanner.close();
    }
}