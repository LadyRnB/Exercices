package training.optional;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import training.Author;
import training.Book;
import training.Language;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class OptionalOperationsTest {
    OptionalOperations optionalOperations = new OptionalOperations();
    Author author = new Author("Kevin", "Ben",
            LocalDate.of(1950, 3, 25), "American", List.of(Language.ENGLISH));
    Book book = new Book("The miracle", List.of(author), Book.Genre.ROMANCE, "123-456",
            LocalDate.of(2020, 8, 25), 100, Language.ENGLISH);
    @Nested
    class GetBookTitleElseUndefined {
        @Test
        void getBookTitleWithPresentBookTest() {

            Optional<Book> bookOptional = Optional.of(book);

            String result = optionalOperations.getBookTitleElseUndefined(bookOptional);
            assertNotNull(result);
            assertEquals("The miracle", result);
            assertDoesNotThrow(() -> optionalOperations.getBookTitleElseUndefined(bookOptional));
        }

        @Test
        void getBookTitleElseUndefinedWithNullBookTest(){
            Optional<Book> bookOptional = null ;
            assertThrows(NullPointerException.class, () -> optionalOperations.getBookTitleElseUndefined(bookOptional));
        }

        @Test
        void getBookTitleElseUndefinedWithEmptyBookTest(){
            Optional<Book> bookOptional = Optional.empty();
            String result = optionalOperations.getBookTitleElseUndefined(bookOptional);
            assertEquals("Undefined", result);
            assertDoesNotThrow(() -> optionalOperations.getBookTitleElseUndefined(bookOptional));
        }
    }

    @Nested
    class GetBookPublicationYearOrThisYear{

        @Test
        void getBookPublicationYearOrThisYearWithPresentBookTest() {

            Optional<Book> bookOptional = Optional.of(book);

            Optional<Integer> result = optionalOperations.getBookPublicationYearOrThisYear(bookOptional);
            assertTrue(result.isPresent());
            assertEquals(2020, result.get());
            assertDoesNotThrow(() -> optionalOperations.getBookPublicationYearOrThisYear(bookOptional));
        }

        @Test
        void getBookPublicationYearOrThisYearWithNullBookTest(){
            Optional<Book> bookOptional = null;
            assertThrows(NullPointerException.class, () -> optionalOperations.getBookPublicationYearOrThisYear(bookOptional));
        }

        @Test
        void getBookPublicationYearOrThisYearWithEmptyBookTest(){
            Optional<Book> bookOptional = Optional.empty();
            Optional<Integer> result = optionalOperations.getBookPublicationYearOrThisYear(bookOptional);

            assertTrue(result.isPresent());
            assertEquals(LocalDate.now().getYear() , result.get());
            assertDoesNotThrow(() -> optionalOperations.getBookPublicationYearOrThisYear(bookOptional));
        }
    }

    @Nested
    class printAuthorsNames{
        @Test
        void printAuthorsNamesWithPresentBookTest() {

            Optional<Book> bookOptional = Optional.of(book);
            assertEquals(List.of(author), bookOptional.get().authors());
            assertDoesNotThrow(() -> optionalOperations.printAuthorsNames(bookOptional));
        }

        @Test
        void printAuthorsNamesWithNullBookTest(){

            Optional<Book> bookOptional = null;
            assertThrows(NullPointerException.class, () -> optionalOperations.printAuthorsNames(bookOptional));
        }

        @Test
        void printAuthorsNamesWithEmptyBookTest(){
            Optional<Book> bookOptional = Optional.empty();
            assertDoesNotThrow(() -> optionalOperations.printAuthorsNames(bookOptional));
        }
    }

    @Nested
    class GetIsbnElseRuntimeException{
        @Test
        void getIsbnElseRuntimeExceptionWithPresentBookTest(){
            Optional<Book> bookOptional = Optional.of(book);
            String result = optionalOperations.getIsbnElseRuntimeException(bookOptional);
            assertNotNull(result);
            assertEquals("123-456", result);
            assertDoesNotThrow(() -> optionalOperations.getIsbnElseRuntimeException(bookOptional));
        }

        @Test
        void getIsbnElseRuntimeExceptionWithNullBookTest(){
            Optional<Book> bookOptional = null;
            assertThrows(NullPointerException.class, () -> optionalOperations.getIsbnElseRuntimeException(bookOptional));
        }

        @Test
        void getIsbnElseRuntimeExceptionWithEmptyBookTest(){
            Optional<Book> bookOptional = Optional.empty();
            assertThrows(RuntimeException.class, () -> optionalOperations.getIsbnElseRuntimeException(bookOptional));
        }

    }

    @Nested
    class GetListOfAuthorsNationalities{
        @Test
        void getListOfAuthorsNationalitiesWithPresentBookTest(){
            Optional<Book> bookOptional = Optional.of(book);
            assertEquals(List.of(author.nationality()), optionalOperations.getListOfAuthorsNationalities(bookOptional));
        }

        @Test
        void getListOfAuthorsNationalitiesWithNullBookTest(){
            Optional<Book> bookOptional = null;
            assertThrows(NullPointerException.class, () -> optionalOperations.getListOfAuthorsNationalities(bookOptional));
        }

        @Test
        void getListOfAuthorsNationalitiesWithEmptyBookTest(){
            Optional<Book> bookOptional = Optional.empty();
            List<String> result = optionalOperations.getListOfAuthorsNationalities(bookOptional);
            assertEquals(Collections.emptyList(), result);
            assertDoesNotThrow(() -> optionalOperations.getListOfAuthorsNationalities(bookOptional));
        }
    }
}
