// 3 Student Grading (Switch Statement) Create a Student class with name and marks. Write a method calculateGrade() that assigns a grade (A, B, C, D, F) based on marks using a switch or if-else ladder. Create 3 students and display their grades.
package easyToMedium.medium;
import java.util.Scanner;
public class Student {
    public String name;
    public int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    void calculateGrade(){
        if(marks>=90){
            System.out.println("A");
        }else if(marks>=80){
            System.out.println("B");
        }else if(marks>=70){
            System.out.println("C");
        }else{
            System.out.println("Fail");
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student std1 = new Student("Samiksha", 90);
        Student std2 = new Student("Samridhdi", 98 );
        Student std3 = new Student("Sonsika", 80);

        std1.calculateGrade();
        std2.calculateGrade();
        std3.calculateGrade();

        sc.close();



    }
}