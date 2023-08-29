package tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Event extends Task {

    private LocalDate from;
    private LocalDate to;
    private static DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("MMM dd yyyy");

    public Event(String description, String from, String to) {
        super(description);
        this.from = LocalDate.parse(from);
        this.to = LocalDate.parse(to);
    }

    @Override
    public String toString() {
        String fromString = this.from.format(DATE_PATTERN);
        String toString = this.to.format(DATE_PATTERN);
        return "[E]" + super.toString() +
                " (from: " + fromString +
                " to: " + toString + ")";
    }
}
