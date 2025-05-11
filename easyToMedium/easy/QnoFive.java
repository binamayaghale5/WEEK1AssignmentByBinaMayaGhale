package easyToMedium.easy;

//5  Write a Java program to check if a person is eligible to vote. (The person must be 18 or older and a citizen.)
import java.util.Scanner;
public class QnoFive {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Do you have a citizenship card? (Y/N)");
        char c = sc.next().charAt(0);

        if(age>=18){
            if(c == 'Y'){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You are not eligible to vote");
            }
        }else{
            System.out.println("You are not eligible to vote");
        }
        sc.close();

    }
}