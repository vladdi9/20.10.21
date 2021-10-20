import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Dates {
    public static void main(String[] args) {
        DateTimeFormatter datetam_f = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm"); // 3

        LocalDate date = LocalDate.now();  //1
        LocalTime time = LocalTime.now();  //1
        LocalDateTime datetime = LocalDateTime.now(); //2
        String s_dt = datetam_f.format(datetime);  //3

        System.out.println(date+" "+time); // 1
        System.out.println(datetime);  // 2
        System.out.println("After formatting: " +s_dt); // 3

    }
}
