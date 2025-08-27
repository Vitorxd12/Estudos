import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalTime;

public class teste {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println("");
            }
        }
        LocalTime localTime2 = LocalTime.now();
        System.out.println(localTime.getNano() - localTime2.getNano());
    }
}

