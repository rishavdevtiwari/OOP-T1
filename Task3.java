//Write a program to check whether a given number is positive, negative, or zero using if-else.
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number!=0){
            if(number < 0) {
                System.out.println("The number is negative.");
            }
            else {
                System.out.println("The number is positive.");
        
            }
        }else{
            System.out.println("The number is zero.");
        }
        sc.close();
    }
}
