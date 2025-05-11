// 9 Constants Usage Example Create a Circle class with an attribute radius. Use a final constant PI = 3.14159. Write a method calculateCircumference() and calculateArea() using PI. Create two Circle objects and display their area and circumference.
package easyToMedium.medium;

public class Circle {
    public double radius;
    public final double  PI  = 3.14159;

    Circle(double radius){
        this.radius = radius;
        
    }

    void calculateCircumference(){
        System.out.println("Circumference: " + (2 * PI * radius));

    }

    void calculateArea(){
        System.out.println("Area: " + (PI * radius * radius));

    }

    public static void main(String[] args){
        System.out.println("Circle 1: ");
        Circle c1 = new Circle(5.5);
        c1.calculateCircumference();
        c1.calculateArea();

        System.out.println("Circle 2: ");
        Circle c2 = new Circle(10.8);
        c2.calculateCircumference();
        c2.calculateArea();



        

    }



}
