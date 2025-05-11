// 10 Manual Car Showroom Inventory Create a Car class with attributes: brand, model, price. Create 5 different Car objects with different details. Display the cars whose price is greater than 20,00,000 (use if statement).
package easyToMedium.medium;

public class Car {
    public String brand;
    public String model;
    public int price;

    Car(String brand, String model , int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayCarDetails(){
        if(this.price >= 2000000){
            System.out.println("\nBrand: " + this.brand + "\nModel: " + this.model + "\nPrice: " + this.price + "\n");
        }

    }

    public static void main(String[] args){
        
        System.out.println("Car 1: ");
        Car c1 = new Car("Toyota", "Toyota Corolla", 1000000 );
        c1.displayCarDetails();

        System.out.println("Car 2: ");
        Car c2 = new Car("Honda", "Honda Civic", 3168000 );
        c2.displayCarDetails();

        System.out.println("Car 3: ");
        Car c3 = new Car("Ford", "Ford Mustang", 4224000 );
        c3.displayCarDetails();
        
        System.out.println("Car 4: ");
        Car c4 = new Car("BMW", "BMW 3 Series", 5940000);
        c4.displayCarDetails();

        System.out.println("Car 5: ");
        Car c5 = new Car("Tesla", "Tesla Model 3", 5148000);
        c5.displayCarDetails();


    }

    
}