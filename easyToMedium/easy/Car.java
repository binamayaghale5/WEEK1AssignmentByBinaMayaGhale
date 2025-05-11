package easyToMedium.easy;
// Create a class Car with attributes brand and year. Create two Car objects in the main method and display their details.
import java.util.Scanner;
public class Car {
    public String brand;
    public int year;

    Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    void displayCar(){
        System.out.println("\n" + "Brand: " + this.brand);
        System.out.println("Year: " + this.year + "\n");
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st car brand: ");
        String br1 = sc.nextLine();
        System.out.println("Enter 1st card date: ");
        int d1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter 2nd car brand: ");
        String br2 = sc.nextLine();
        System.out.println("Enter 2nd card date: ");
        int d2 = sc.nextInt();
        sc.nextLine();



        Car car1 = new Car(br1, d1);
        Car car2 = new Car(br2, d2);

        car1.displayCar();
        car2.displayCar();

        sc.close();
    }
}