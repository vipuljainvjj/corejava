package com.vipul.time;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UTCBasics {

    public static void main(String[] args) {
        String dateString = "2020-02-02T09:44:44.100+00:00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        //Here UTC +00:00 is ignored
        LocalDateTime localDateTime = LocalDateTime.from(dateTimeFormatter.parse(dateString));
        //Here UTC +00:00 is considered
        ZonedDateTime zonedDateTime = ZonedDateTime.from(dateTimeFormatter.parse(dateString));


        Date date = Date.from(zonedDateTime.toInstant());
    }
}
