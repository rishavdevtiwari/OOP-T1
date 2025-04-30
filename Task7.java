//Input the age of a person and check if they are eligible to vote (18 or older).
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        scanner.close();
    }
}
