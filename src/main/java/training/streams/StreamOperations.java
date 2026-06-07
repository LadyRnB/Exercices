package training.streams;

import java.time.LocalDate;
import training.Book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperations {
    static void main(String[] args) {}

    public Set<Book.Genre> listBooksGenres(List<Book> books) {
        if(books == null) {
            return Collections.emptySet();
        }
            return books.stream()
                    .map(Book::genre)
                    .collect(Collectors.toSet());
    }

    public List<String> ListBooksTitleOfGenreRomance(List<Book> books) {
        return books.stream()
                    .filter(book -> book.genre().equals(Book.Genre.ROMANCE))
                    .map(Book::title)
                    .toList();
    }

    public int sumPageCountOfBooksPublishedIn2025(List<Book> books) {
        return books.stream()
                    .filter(book -> book.publicationDate().getYear() == 2025)
                    .collect((Collectors.summingInt(Book::pageCount)));
//        return books.stream()
//                .filter(book -> book.publicationDate().getYear() == 2025)
//                .mapToInt(Book::pageCount)
//                .sum();
    }

    public String getTitleOfOldestBook(List<Book> books) {
        return books.stream()
                    .min(Comparator.comparing(Book::publicationDate))
                    .map(Book::title)
                    .orElse(null);
    }

    public String getIsbnOfNewestBook(List<Book> books) {
        return books.stream()
                    .max(Comparator.comparing(Book::publicationDate))
                    .map(Book::isbn)
                    .orElse(null);
    }

    public List<String> listBooksAuthorsFullNames(List<Book> books) {
        return books.stream()
                    .flatMap(book -> book.authors().stream())
                    .map(author -> author.firstName() + " " + author.lastName())
                    .toList();
    }

    public int sumAgesOfAuthors(List<Book> books) {
        return books.stream()
                    .flatMap(book  -> book.authors().stream())
                    .mapToInt( author -> LocalDate.now().getYear() - author.birthDate().getYear())
                    .sum();
    }
}
