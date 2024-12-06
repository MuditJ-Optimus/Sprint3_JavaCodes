/*Create a Book class with the following attributes: title, author, and price. Provide a constructor to initialize these 
attributes and a method to display the book details.*/
class Book {

    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println(title+" is written by "+author);
        System.out.println("The price of this book is "+price);
    }
}
public class Program5{
    public static void main(String[] args) {
        Book b1=new Book("The Alchemist","Paulo Coelho",99.99);
    b1.display();
    }
}
