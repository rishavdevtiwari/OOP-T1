//Input a number and display the factorial of that number using a for loop.

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        long factorial = 1;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        sc.close();
    }
}
