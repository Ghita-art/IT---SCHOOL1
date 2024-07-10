package kata.session_3;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("OCA");

        BookService bookService = new BookService();
        bookService.addBook(book1);

    }
}
