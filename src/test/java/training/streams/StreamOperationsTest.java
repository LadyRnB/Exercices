package training.streams;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import training.Author;
import training.Book;
import training.Language;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StreamOperationsTest {

    @Nested
    class ListBookGenres {
        StreamOperations streamOperations  = new StreamOperations();
        Author author = new Author("Kevin", "Ben", LocalDate.of(1950, 7, 13), "American", List.of(Language.ENGLISH));
        Author author1 = new Author("Carol", "Nieder", LocalDate.of(1986, 6, 9), "British",  List.of(Language.ENGLISH));
        Book book = new Book("The miracle", List.of(author), Book.Genre.ROMANCE, "123-456",
                LocalDate.of(2020, 5, 16), 100, Language.ENGLISH);
        Book book1 = new Book("Songs", List.of(author1), Book.Genre.BIOGRAPHY, "456-789",
                LocalDate.of(2022, 9, 16), 150, Language.ENGLISH);


        @Test
        void listBookGenresWithValidBook() {
            Set<Book.Genre> result = streamOperations.listBooksGenres(List.of(book, book1));
            assertEquals(Set.of(Book.Genre.ROMANCE, Book.Genre.BIOGRAPHY), result);
        }

        @Test
        void listBookGenresWithEmptyBook(){
            Set<Book.Genre> result = streamOperations.listBooksGenres(List.of());
            assertTrue(result.isEmpty());
            assertTrue(true, result.toString());
        }

        @Test
        void listBookGenresWithNullBook() {
            assertDoesNotThrow(() -> streamOperations.listBooksGenres(null));
            assertEquals(Set.of(), streamOperations.listBooksGenres(null));
        }
    }

    @Nested
    class ListBooksTitleOfGenreRomance{

        @Test
        void listBooksTitleOfGenreRomanceWithValidBook(){

        }
    }

}
