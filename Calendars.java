package org.itstep;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calendars {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Date date0 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String sdate = simpleDateFormat.format(date0);
        calendar.add(Calendar.MONTH,1);
        Date date2 = calendar.getTime();
        sdate = simpleDateFormat.format(date2);
        System.out.println(sdate);
        System.out.println(date2);

        calendar = new GregorianCalendar(2020,Calendar.DECEMBER,19);
        Date specDate = calendar.getTime();
        sdate = simpleDateFormat.format(specDate);
        System.out.println(sdate);

        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        System.out.println("TimeZone : " + timeZone.getID() + " ("
                + timeZone.getDisplayName() + ")\n");
    }
}
