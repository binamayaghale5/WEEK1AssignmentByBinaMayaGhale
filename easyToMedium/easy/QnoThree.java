package easyToMedium.easy;
//3  Write a Java program that checks if a number (taken as input) is even or odd using an if-else statement.
import java.util.Scanner;
public class QnoThree {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println(num + " is Even");
        }else{
            System.out.println(num + " is Odd");
        }

        sc.close();


    }
}
