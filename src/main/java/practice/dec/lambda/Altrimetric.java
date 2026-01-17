package practice.dec.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Altrimetric {

//    employeeId
//    checkin TIme
//    checkout time
//    date
//
//    Monday - single file
//    Tuesday - another


//    find employees more than 6 hrs atleast 3 days in a week
    public static void main(String[] args) throws IOException {
        //

        Map<String, Long> empHours = new HashMap<>();

        List<String> lines = Files.readAllLines(Paths.get(""));

        for(String line : lines){
            String[] data = line.split(",");
            String employeeId = data[0];
            String checkInTime = data[1];
            String checkOutTime = data[2];

            LocalTime localcheckInTime = LocalTime.parse(checkInTime);
            LocalTime localcheckOutTime = LocalTime.parse(checkOutTime);
            long duration = Duration.between(localcheckInTime,localcheckOutTime).toHours();
            empHours.put(employeeId,empHours.getOrDefault(employeeId,0l) + duration);

        }


        empHours.entrySet().stream().filter(e-> e.getValue()>6).forEach(e->System.out.println(e.getKey()));





    }
}
