package org.java.dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExamples {
    public static void main(String[] args) {

        //Only date now
        LocalDate localDate = LocalDate.now();

        //Date and hour now.
        LocalDateTime localDateTime = LocalDateTime.now();

        //Date and hour by GMT - London.
        Instant instantDateFormat = Instant.parse("2026-01-29T15:46:12Z");

        //Personalize date and hour.
        LocalDate localDateSpecific = LocalDate.parse("2025-12-25");

        //Date and hour formatter.
        LocalDateTime localDateTimeSpecific = LocalDateTime.parse("2025-12-25T19:01:12");

        //Date time formatter - methods
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDateFormetter = LocalDate.parse("10/09/2010", dtf1);
// --------- OR -----------
        LocalDate localDateFormatter2 = LocalDate.parse("10/09/2010", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        //_______________________________________________________________________
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH/mm");
        LocalDate localDateFormatterOfPattern = LocalDate.parse("2022-07-20");
        //_______________________________________________________________________
        LocalDate localDateYearMonthDay = LocalDate.of(2022, 10, 01);
        LocalDateTime localDateHourMinuts = LocalDateTime.of(2022, 10, 01, 02, 10);

        //SHOW DATE AND HOUR WITH BASE SP BUT PRINT IN GMT
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println(dateTimeFormatter.format(instantDateFormat));

        //Convert Instant in local date with system default date
        LocalDate r1 = LocalDate.ofInstant(instantDateFormat, ZoneId.systemDefault());
        System.out.println(r1);
    }
}
