import java.util.List;

public class BookManager {
    public void issueBook(Library library, Book book) {
        List<Book> books = library.getBooks();
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Выдана книга: " + book.getTitle());
        } else {
            System.out.println("Книга не найдена");
        }
    }

    public void returnBook(Library library, Book book) {
        library.addBook(book);
        
        System.out.println("Книга возвращена: " + book.getTitle());
    }
}
