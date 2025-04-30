//Take marks of five subjects and calculate the total, percentage, and grade using if-else.

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks of first subject:");
        int marks1 = sc.nextInt();
        System.out.print("Enter marks of second subject: ");
        int marks2=sc.nextInt();
        System.out.print("Enter marks of third subject: ");
        int marks3 = sc.nextInt();
        System.out.print("Enter marks of fourth subject: ");
        int marks4 = sc.nextInt();
        System.out.print("Enter marks of fifth subject: ");
        int marks5 = sc.nextInt();

        int total = marks1 + marks2 + marks3 + marks4 + marks5;

        double percentage = total / 5.0;
        char grade;
        if(percentage>=90){
            grade = 'A';
        }else if (percentage >= 80) {
            grade = 'B';
        }else if(percentage>=70){
            grade='C';
        }else if(percentage>=60){
            grade='D';
        }else if(percentage>=50){
            grade = 'E';
        }else if(percentage>=40){
            grade='F';
        }else{
            grade = '!';
        }
        System.out.println("The total marks obtained are : "+total);
        System.out.println("The percentage obtained are : "+percentage);
        System.out.println("The grade obtained is : "+grade);
            sc.close();
    }
}
