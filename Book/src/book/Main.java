
package book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an instance of Book
        Book book = new Book();
        
        // Prompt user for book details
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        book.setTitle(title);
        
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        book.setAuthor(author);
        
        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        book.setPrice(price);
        
        // Close the scanner
        scanner.close();
        
        // Retrieve and print book details using getter methods
        System.out.println("\nBook Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: R1" + book.getPrice());
    }
}


//    HARDCODED VALUES
//        // Create an instance of Book
//        Book book = new Book();
//        
//        // Set book details using setter methods
//        book.setTitle("The Great Gatsby");
//        book.setAuthor("F. Scott Fitzgerald");
//        book.setPrice(12.99);
//        
//        // Retrieve and print book details using getter methods
//        System.out.println("Book Details:");
//        System.out.println("Title: " + book.getTitle());
//        System.out.println("Author: " + book.getAuthor());
//        System.out.println("Price: $" + book.getPrice());
//    }
//}