//Input a number and reverse it using a for loop.
import java.util.Scanner;
public class Task22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
             number /= 10;
             }
            System.out.print("The reversed number is : "+reversed);
        sc.close();
    }
}
