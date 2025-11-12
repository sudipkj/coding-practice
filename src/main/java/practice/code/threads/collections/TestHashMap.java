package practice.code.threads.collections;

import java.time.*;
import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();

        names.put(1, "Sudip");
        var a = names.put(1, "Rakesh");
        System.out.println(a);
        System.out.println(names);

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate : "+localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime : "+localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : "+localDateTime);
        ZonedDateTime zonedDate = ZonedDateTime.now();
        System.out.println("zonedDate : "+zonedDate);
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("OffsetDateTime : "+offsetDateTime);


    }
}
