//Write a program to print the multiplication table of a given number using for loop.

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+"*"+i+"="+n*i);
    }
    sc.close();
    }
}
