import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        final OffsetDateTime dateTime = OffsetDateTime.now(ZoneId.of("Asia/Seoul"));
        final String currentDate = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(currentDate);
    }
}
