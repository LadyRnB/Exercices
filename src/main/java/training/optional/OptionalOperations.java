package training.optional;

import java.time.LocalDate;
import training.Book;
import java.util.List;
import java.util.Optional;

public class OptionalOperations {

    public String getBookTitleElseUndefined(Optional<Book> bookOptional) {
        return bookOptional.map(book -> book.title())
                .orElse("Undefined");
    }

    public Optional<Integer> getBookPublicationYear(Optional<Book> bookOptional) {
        return bookOptional
                .map(book -> book.publicationDate().getYear());
    }

    public Optional<Integer> getBookPublicationYearOrThisYear(Optional<Book> bookOptional) {
        return bookOptional
                .map(book -> book.publicationDate().getYear())
                .or(() -> Optional.of(LocalDate.now().getYear()));
    }

    public void printAuthorsNames(Optional<Book> bookOptional) {
//       if (bookOptional.isPresent()){
//          Book book =  bookOptional.get();
//          for (Author author : book.authors()) {
//              System.out.println(author.firstName()+ " " + author.lastName());
//          }
//       }
        bookOptional.map(Book::authors).ifPresent(authors -> {
            authors.stream()
                    .map(author -> author.firstName() + " " + author.lastName())
                    .forEach(System.out::println);
        });
    }

    public String getIsbnElseRuntimeException(Optional<Book> bookOptional) {
//        return bookOptional.map(book -> book.isbn())
//                .orElseThrow(RuntimeException::new);
        if (bookOptional.isPresent()) {
            Book book = bookOptional.get();
            return book.isbn();
        } else {
            throw new RuntimeException();
        }
    }

    public List<String> getListOfAuthorsNationalities(Optional<Book> bookOptional) {
//        if (bookOptional.isPresent()){
//            Book book = bookOptional.get();
//            List<String> nationalities = new ArrayList();
//            for(Author author : book.authors()) {
//              nationalities.add(author.nationality());
//            }
//            return nationalities;
//        }   return Collections.emptyList();
        return bookOptional.stream()
                .flatMap(book -> book.authors().stream())
                .map(author -> author.nationality())
                .toList();
    }
}
