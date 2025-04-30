//Take two numbers and an operator (+, -, *, /) and perform the operation using switch.
import java.util.Scanner;
    public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1= sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2= sc.nextInt();
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        sc.close();

        switch (operator) {
            case '+':
                System.out.println("The sum of two number is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The subraction of two number is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The multiplication of two number is: " + (num1 * num2));
                break;
            case '/':
                System.out.println("The division of two number is: " + ( num1 / num2));
                break;
            default:
                System.out.println("Invalid grade.");
                return;
        }

    
    }
}