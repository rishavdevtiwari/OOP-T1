//Input a number and check if it is a perfect square using for loop.

import java.util.Scanner;
public class Task20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPerfectSquare = false;

        for (int i = 1; i <= number / 2; i++) {
            if (i * i == number) {
                isPerfectSquare = true;
                break;
            }
        }

        // Special case for 0 and 1
        if (number == 0 || number == 1) {
            isPerfectSquare = true;
        }

        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is NOT a perfect square.");
        }

        sc.close();
    }
}
