import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getters to access private fields
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of type Book
        ArrayList<Book> bookList = new ArrayList<>();

        // Adding book objects to the list
        bookList.add(new Book(1, "The Catcher in the Rye", "J.D. Salinger"));
        bookList.add(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(3, "1984", "George Orwell"));

        // Displaying all book details using an advanced for loop
        for (Book book : bookList) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Author Name: " + book.getAuthorName());
            System.out.println();
        }
    }
}
