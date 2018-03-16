package Datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by pjai58 on 11/13/2017.
 */
public class LocalDate1 {

    public static void main(String args[]){

        LocalDate date = LocalDate.now();

        System.out.println(date);

        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date.plusDays(1);

        System.out.println(yesterday +"  " + tomorrow);

        LocalDate date2 = LocalDate.of(2017,1,01);

        LocalTime time = LocalTime.now();
        LocalDateTime dt = date2.atTime(time);
        System.out.println(time + "   " +dt);
        System.out.println(date2.plusYears(23));
        System.out.println(date2.compareTo(date));

       // DateTimeFormatter format1 = DateTimeFormatter.
    }

}
