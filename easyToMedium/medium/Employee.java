// 6 Employee Bonus Calculation Create a class Employee with name, salary, and yearsOfExperience. Write a method calculateBonus():
// If experience > 5 years, bonus = 20% of salary
// Otherwise, bonus = 10% of salary Display the bonus amount for each employee.
package easyToMedium.medium;
import java.util.Scanner;
public class Employee{
    public String name;
    public int salary;
    public int yearsOfExperience;

    public Employee(String name, int salary, int exp){
        this.name =name;
        this.salary = salary;
        this.yearsOfExperience = exp;
    }

    void calculateBonus(int salary, int exp){
        if(exp > 5){
            double bonus = 0.2 * salary;
            System.out.println("Total salary of emp1: " + (salary + bonus));
        }else{
            double bonus = 0.1 * salary;
            System.out.println("Total salary of emp1: " + (salary + bonus));
        }

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String n1 = sc.nextLine();
        System.out.println("Enter your salary: ");
        int s1 = sc.nextInt();
        System.out.println("Enter you years of experience: ");
        int exp1 = sc.nextInt();
        sc.nextLine();
        Employee emp1 = new Employee(n1, s1, exp1);
        emp1.calculateBonus(s1, exp1);

        System.out.println("Enter your name: ");
        String n2 = sc.nextLine();
        System.out.println("Enter your salary: ");
        int s2 = sc.nextInt();
        System.out.println("Enter you years of experience: ");
        int exp2 = sc.nextInt();
        Employee emp2 = new Employee(n2, s2, exp2);
        emp2.calculateBonus(s2, exp2);

        sc.close();





    }

}