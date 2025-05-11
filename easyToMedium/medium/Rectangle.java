// 4 Create a class Rectangle with length and width. Initialize using a constructor. Create a method calculateArea() that returns the area. Create 3 rectangles of different dimensions and display their areas.
package easyToMedium.medium;
import java.util.Scanner;
public class Rectangle {
    public int length;
    public int width;

    public Rectangle(int len, int wid){
        this.length = len;
        this.width = wid;
    }

     void calculateArea(int len, int wid){
        int Area = len * wid ; 
        System.out.println("Area of rectangle is: " + Area);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Rectangle 1: ");
        System.out.println("Enter the lenghth: ");
        int  l1 = sc.nextInt();
        System.out.println("Enter the width");
        int w1 = sc.nextInt();
        Rectangle r1 = new Rectangle(l1, w1 );
        r1.calculateArea(l1,w1);

        System.out.println("Rectangle 2: ");
        System.out.println("Enter the lenghth: ");
        int l2 = sc.nextInt();
        System.out.println("Enter the width");
        int w2 = sc.nextInt();
        Rectangle r2 = new Rectangle(l2, w2 );
        r2.calculateArea(l2,w2);

        System.out.println("Rectangle 3: ");
        System.out.println("Enter the lenghth: ");
        int l3 = sc.nextInt();
        System.out.println("Enter the width");
        int w3 = sc.nextInt();
        Rectangle r3 = new Rectangle(l3, w3 );
        r3.calculateArea(l3,w3);

        sc.close();




        
    }
}