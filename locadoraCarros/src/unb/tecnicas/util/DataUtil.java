package unb.tecnicas.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public final class DataUtil {

    private final static String formato = "dd/MM/yyyy HH:MM";

    public static LocalDateTime stringToDate(String date) throws DateTimeParseException {
        if (date.length() < formato.length()) {
            return null;
        }
        date = date.concat(":00");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        return dateTime;
    }


}
