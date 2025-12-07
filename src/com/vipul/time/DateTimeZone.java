package com.vipul.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeZone {

    public static void main(String[] args) throws ParseException {

        //Without Timezone
        /*String myDateString = "2001-07-04T12:08:56";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date myDate = formatter.parse(myDateString);

        System.out.println(myDate);

        SimpleDateFormat extendedformatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        String myDateExtended = extendedformatter.format(myDate);

        System.out.println(myDateExtended);

        System.out.println("===============================");

        String myDateString1 = "2001-07-04T12:08:56.000+0530";
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        formatter1.setTimeZone(TimeZone.getTimeZone(ZoneId.of("UTC")));
        Date myDate1 = formatter1.parse(myDateString1);

        System.out.println(myDate1 + ": " + formatter1.getTimeZone());

        SimpleDateFormat extendedformatter1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        extendedformatter1.setTimeZone(TimeZone.getTimeZone(ZoneId.of("UTC")));
        String myDateExtended1 = extendedformatter1.format(myDate1);

        System.out.println(myDateExtended1 + ": " + extendedformatter1.getTimeZone() + ": ");*/

        String myDateString = "2022-06-14";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = formatter.parse(myDateString);

        SimpleDateFormat extendedformatter1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        String myDateExtended1 = extendedformatter1.format(myDate);
        System.out.println(myDateExtended1);

        SimpleDateFormat extendedformatter2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        extendedformatter2.setTimeZone(TimeZone.getTimeZone(ZoneId.of("UTC")));
        Date myDateExtended2 = extendedformatter2.parse(myDateExtended1);
        System.out.println(myDateExtended2);


        String myTimeString = "2022-06-14T14:20:25.000Z";
        SimpleDateFormat timeFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        timeFormatter.setTimeZone(TimeZone.getTimeZone(ZoneId.of("UTC")));
        Date myTime = timeFormatter.parse(myTimeString);
        System.out.println(myTime);

        SimpleDateFormat extendedformatter4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        extendedformatter4.setTimeZone(TimeZone.getTimeZone(ZoneId.of("UTC")));
        Date myTime1 = extendedformatter4.parse(myTimeString);
        System.out.println(myTime1);












    }
}
