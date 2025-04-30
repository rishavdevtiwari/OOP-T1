//Take a number from the user and print whether it is even or odd.
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.print("The number is even");
        }else{
        System.out.print("The number is odd");
    }}
}
