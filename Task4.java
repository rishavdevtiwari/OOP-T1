//Write a program that takes a number and checks if it is divisible by both 5 and 11.
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " is divisible by both 5 and 11.");
        }else{
            if(number%5==0 && number%11!=0){
                System.out.println(number+" is divisible by 5 and not by 11");
            }else if(number%5!=0 && number%11==0){
                System.out.println(number + " is divisible by 11 and not by 5.");
            }else{
                System.out.println(number + " is not divisible by either 5 or 11.");
            }
        }
        scanner.close();
    }
}
