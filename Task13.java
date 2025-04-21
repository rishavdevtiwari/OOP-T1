//Take a number n and print the sum of first n natural numbers using a loop.

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
    Scanner var1 = new Scanner(System.in);
      System.out.print("Enter your number to sum to from 1: ");
      int var2 = var1.nextInt();
      int var3 = 0;

      for(int var4 = 1; var4 <= var2; ++var4) {
         var3 += var4;
      }

      System.out.println("The sum of numbers from 1 to " + var2 + " is:" + var3);
      var1.close();
    }
}
