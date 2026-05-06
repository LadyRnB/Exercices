package io.training;

import java.time.LocalDate;
import java.util.List;

public record Book(
        String title,
        List<Author> authors,
        Genre genre,
        String isbn,
        LocalDate publicationDate,
        int pageCount,
        Language language
) {

    public enum Genre {
        ROMANCE,
        BIOGRAPHY,
        FICTION,
        ESSAY
    }
}
