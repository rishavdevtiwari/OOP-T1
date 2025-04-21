//Input a number from the user and display whether it is a prime number using a for loop.
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        if (number <= 1) {
            System.out.println(number + " is NOT a prime number.");
        } else {
  
            int count = 0;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is NOT a prime number.");
            }
        }
        sc.close();
    }
}
