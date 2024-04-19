// для лучшей поддерживаемости и расширяемости кода мы разделили класс library на два класса: Library,который управляет списком книг и BookManager,который отвечает за операции с книгами (выдача и возврат).
//это соответствует первому принципу SOLID: Принцип единственной ответственности (классы должны иметь только одну причину для изменения)

// Согласно второму принципу (Принцип открытости/закрытости): классы Library и BookManager будут открыты для расширения (путем добавления новых методов, например, для поиска книг), но закрыты для модификации

//Также в данном рефакторе кода был использован принцип инверсии зависимостей: классы Library и BookManager зависят от абстракций (например, от интерфейса Book), а не от конкретной реализации.

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Доступные книги:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}
