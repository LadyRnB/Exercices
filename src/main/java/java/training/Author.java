package java.training;

import java.time.LocalDate;
import java.util.List;

public record Author(
        String firstName,
        String lastName,
        LocalDate birthDate,
        String nationality,
        List<Language> languages
) {
}
