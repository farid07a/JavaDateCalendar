/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object_Calendar_fields;

import java.util.Calendar;
import java.util.Date;
import javadatecalendar.DF;


/**
 *
 * @author horizon
 */
public class Calender_class {

    public static void main(String[] args) {
        Calendar calendarInst=Calendar.getInstance();// not new calendar bcs abstract class calendar
        System.out.println(calendarInst);
        
        
        Date DtFromCalendar=calendarInst.getTime();// Date GetTime to get Date out the Calendar
        
        int date=17;
        int month=0;//january
        int year=2011;
        
        
        calendarInst.clear();// clear all field make calendar object in 1970
        
        calendarInst.set(Calendar.YEAR, year);// year =1;
        calendarInst.set(Calendar.DATE, date);//date
        calendarInst.set(Calendar.MONTH, month);// for month
        
        Date DateFromCal=calendarInst.getTime();
        
        System.out.println(DF.LongD.format(DateFromCal));
        
        
        calendarInst.add(Calendar.YEAR, 20);// add date for the date 
        
        DateFromCal=calendarInst.getTime();
        
        
        System.out.println(DF.LongD.format(DateFromCal));
        calendarInst.clear();
        for (int i = 0; i <= 40; i++) {
            calendarInst.add(Calendar.DATE, 1);
            System.out.println("Date is "+DF.LongD.format(calendarInst.getTime()));
        }
        calendarInst=Calendar.getInstance();
       int ThisMonth =calendarInst.get(Calendar.MONTH);
       
       
        while (ThisMonth==calendarInst.get(Calendar.MONTH)) {            
            
            calendarInst.add(Calendar.DATE, 1);
            
            System.out.println(DF.LongD.format(calendarInst.getTime()));
            
        }
        
        
        
    }
    
}
