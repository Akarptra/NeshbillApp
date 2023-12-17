/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author lenovo
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


import java.util.Date;
import java.util.TimeZone;

public class currentDate {
    public static String getDate(){
        Date date = new Date();
        String days, months;
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Indonesian"));
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        if(day < 10){
            days = "0" + day;
        }else{
            days = String.valueOf(day);
        }
        if(month < 10){
            months = "0" + month;
        }else{
            months = String.valueOf(month);
        }
        
        return year + "-" + months + "-" + days; 
    }
}
