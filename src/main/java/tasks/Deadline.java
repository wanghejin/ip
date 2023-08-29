package tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Deadline extends Task {

    protected LocalDate date;
    private static DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("MMM dd yyyy");

    public Deadline(String description, String by) {
        super(description);
        LocalDate date = LocalDate.parse(by);
        this.date = date;
    }

    @Override
    public String toString() {
        String byString = this.date.format(DATE_PATTERN);
        return "[D]" + super.toString() + " (by: " + byString + ")";
    }
}

