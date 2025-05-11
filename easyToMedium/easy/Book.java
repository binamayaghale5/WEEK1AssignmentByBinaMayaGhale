package easyToMedium.easy;
// 7 Create a class Book with attributes title and author. Initialize them using a constructor, and print the details using a method showBook().
import java.util.Scanner;
public class Book {
    public String title;
    public String author;

    Book(String title, String author){ //constructor
        this.title = title;
        this.author = author;
    }

    void showBook(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title of book : ");
        String title = sc.nextLine();

        System.out.println("Enter the author of the book : ");
        String author = sc.nextLine();

        //create object
        Book book = new Book(title, author);
        book.showBook();

        sc.close();
    }

    
}