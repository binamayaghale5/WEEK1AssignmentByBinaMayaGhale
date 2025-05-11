//5 Movie Details Manager Create a Movie class with attributes: name, language, rating (out of 5). Create a method displayMovieDetails(). In main(), create 4 Movie objects and call displayMovieDetails().
package easyToMedium.medium;
import java.util.Scanner;
public class Movie {
    public String name;
    public String language;
    public int rating;

    Movie(String name , String lang , int rate){
        this.name = name;
        this.language = lang;
        this.rating = rate;
    }

    void displayMovieDetails(){
        System.out.println("\nDetails: ");
        System.out.println("Name: " + this.name);
        System.out.println("Language" + this.language);
        System.out.println("Ratings: "+ this.rating + "\n");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Name: ");
        String n1 = sc.nextLine();
        System.out.println("Language: ");
        String l1 = sc.nextLine();
        System.out.println("Rating: ");
        int r1 = sc.nextInt();
        Movie m1 = new Movie(n1, l1, r1);
        m1.displayMovieDetails();
        sc.close();


    }
}