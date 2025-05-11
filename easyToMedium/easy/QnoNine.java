package easyToMedium.easy;

// 9 Write a Java program that takes a number and prints whether the number is positive, negative, or zero.
import java.util.Scanner;
public class QnoNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num>0){
            System.err.println("Positive");
        }else if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        sc.close();
    }
}