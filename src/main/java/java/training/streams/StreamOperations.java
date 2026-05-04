package java.training.streams;

import java.training.Book;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperations {
    static void main(String[] args) {}

    public Set<Book.Genre> listBooksGenres(List<Book> books) {
        return books.stream()
                .map(Book::genre)
                .collect(Collectors.toSet());
    }

    public List<String> ListBooksTitleOfGenreRomance(List<Book> books) {
        return null;
    }

    public int sumPageCountOfBooksPublishedIn2025(List<Book> books) {
        return 0;
    }

    public String getTitleOfOldestBook(List<Book> books) {
        return null;
    }

    public String getAuthorAgeOfNewestBook(List<Book> books) {
        return null;
    }

    public List<String> listBooksAuthorsFullNames(List<Book> books) {
        return null;
    }
}
