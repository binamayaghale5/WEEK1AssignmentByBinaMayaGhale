
// 1 Create a Book class with attributes: title, author, ISBN. In the main() method, create 5 different Book objects manually and display their details using a method showDetails().
package easyToMedium.medium;

import java.util.Scanner;


public class Book {
    public String title;
    public String author;
    public int ISBN;

    public Book(String ti, String au, int isbn){
        this.title = ti;
        this.author = au;
        this.ISBN = isbn;
    }

    void showDetails(){
        System.out.println("\n" + "Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN " + this.ISBN );
        System.out.println("\n");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Book1: ");
        System.out.println("Title: ");
        String au1 = sc.nextLine();
        System.out.println("Author: ");
        String ti1 = sc.nextLine();
        System.out.println("ISBN: ");
        int isbn1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Book2: ");
        System.out.println("Title: ");
        String au2 = sc.nextLine();
        System.out.println("Author: ");
        String ti2 = sc.nextLine();
        System.out.println("ISBN: ");
        int isbn2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Book3: ");
        System.out.println("Title: ");
        String au3 = sc.nextLine();
        System.out.println("Author: ");
        String ti3 = sc.nextLine();
        System.out.println("ISBN: ");
        int isbn3 = sc.nextInt();
        sc.nextLine();

        System.out.println("Book4: ");
        System.out.println("Title: ");
        String au4 = sc.nextLine();
        System.out.println("Author: ");
        String ti4 = sc.nextLine();
        System.out.println("ISBN: ");
        int isbn4 = sc.nextInt();
        sc.nextLine();

        System.out.println("Book5: ");
        System.out.println("Title: ");
        String au5 = sc.nextLine();
        System.out.println("Author: ");
        String ti5 = sc.nextLine();
        System.out.println("ISBN: ");
        int isbn5 = sc.nextInt();
        sc.nextLine();

        Book bk1 = new Book(ti1, au1, isbn1);
        Book bk2 = new Book(ti2, au2, isbn2);
        Book bk3 = new Book(ti3, au3, isbn3);
        Book bk4 = new Book(ti4, au4, isbn4);
        Book bk5 = new Book(ti5, au5, isbn5);

        bk1.showDetails();
        bk2.showDetails();
        bk3.showDetails();
        bk4.showDetails();
        bk5.showDetails();

        sc.close();



    }
}