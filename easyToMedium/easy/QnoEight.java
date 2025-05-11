package easyToMedium.easy;

// Write a Java program that asks the user to enter two numbers and an operator (+, -, *, /) and then calculates the result based on the operator using if-else statements.
import java.util.Scanner;
public class QnoEight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Enter an operator to perform calculation(+,-,*,/): ");
        char operator = sc.next().charAt(0);

        if(operator == '+'){
            System.out.println("Sum is: " + (num1+num2) );
        }else if(operator == '-'){
            System.out.println("Difference is: " + (num1-num2) );
        }else if(operator == '*'){
            System.out.println("Product is: " + (num1*num2) );
        }else if(operator == '/'){
            if(num2 == 0){
                System.out.println("Division by zero is not possible.");
            }else{
                System.out.println("Quotient is: " + (num1/num2) );
            }
        }else{
            System.out.println("Invalid operator");
        }

        sc.close();




    }
}