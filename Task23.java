//Take a number and check whether it is a palindrome or not using if-else and loop.

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();

        int num = originalNumber;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;       
            reversed = reversed * 10 + digit; 
            num /= 10;               
        }

        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a Palindrome.");
        } else {
            System.out.println(originalNumber + " is NOT a Palindrome.");
        }
        scanner.close();
    }
}
