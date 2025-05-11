package easyToMedium.easy;

// 6 Write a Java program that takes two numbers and prints the greater number.
import java.util.Scanner;
public class QnoSix {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num1 + "(num1) is Greater");
        }else{
            System.out.println(num2 + "(num2) is Greater");
        }

        sc.close();



    }
}
