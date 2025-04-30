import java.util.Scanner;

public class Task19 {
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // Read a single character

        switch (Character.toLowerCase(ch)) { // Convert to lowercase to simplify cases
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is not a vowel.");
        }

        sc.close();
    }
}
