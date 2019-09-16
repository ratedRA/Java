package com.codersbid;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Main {
    private static Date createdDateAfter;
    private static Date createdDateBefore;
    protected static int age;
    private static TimeUnit timeUnit;

    public static void main(String[] args) {
        Instant currentTime = Instant.now();
        Instant oneHourAgo = currentTime.minus(1, ChronoUnit.HOURS);
        Instant twoHourAgo = currentTime.minus(2, ChronoUnit.HOURS);
        Date getOneHourAgo = Date.from(oneHourAgo);
        createdDateBefore = getOneHourAgo;
        System.out.println(createdDateBefore);
        Calendar cal = Calendar.getInstance();
        //System.out.println(cal);
        cal.setTime(getOneHourAgo);
        cal.add(Calendar.HOUR,-1);
        //System.out.println(cal.getTime());
        createdDateAfter = cal.getTime();
        System.out.println("created after"+" " +createdDateAfter);

        //timeUnit = new TimeUnit("new time", Calendar.HOUR_OF_DAY, 60*TimeUnit.MINUTE.getMillis());

        System.out.println(timeUnit.SECOND.getMillis());
    }
    protected void setAge(int x){
        this.age  = x;
    }
}
