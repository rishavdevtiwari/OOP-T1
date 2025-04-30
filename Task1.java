//Write a Java program to input your full name and print a greeting message.
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello, " + name + "! Welcome!");
        sc.close();
    }
}