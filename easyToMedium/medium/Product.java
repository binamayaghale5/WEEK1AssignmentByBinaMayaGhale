//7  Product Discount Calculator Create a class Product with productName, price, and discountPercentage. Write a method calculateFinalPrice() which returns price after discount. Create 3 different products and print their final prices.
package easyToMedium.medium;
public class Product {
    public String productName;
    public int price;
    public double discountPercentage;

    Product(String name, int price, double per){
        this.productName = name;
        this.price = price;
        this.discountPercentage = per;
    }

    void calculateFinalPrice(){
        System.out.println("Final price after discount: " + (price - discountPercentage));

    }

    public static void main(String[] args){
        Product p1 = new Product("Book", 2000, 0.5 );
        Product p2 = new Product("Sketch Pen", 1500, 0.1);

        p1.calculateFinalPrice();
        p2.calculateFinalPrice();
    }
}
