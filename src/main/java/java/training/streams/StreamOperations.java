package java.training.streams;

import java.training.Book;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperations {
    static void main(String[] args) {}

    public List<String> listBooksAuthorsFullNames(List<Book> books) {
        return null;
    }

    public Set<Book.Genre> listBooksGenres(List<Book> books) {
        return books.stream()
                .map(Book::genre)
                .collect(Collectors.toSet());
    }
}
