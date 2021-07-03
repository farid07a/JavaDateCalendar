/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object_Calendar_fields;

import java.util.Calendar;

/**
 *
 * @author farid
 */
public class Fields_Calendar {
    
    
    public static void main(String[] args) {
        
        System.out.println(Calendar.MILLISECOND);
        System.out.println(Calendar.MINUTE);
        System.out.println(Calendar.MONTH);
        System.out.println("***************************");
        Calendar cal=Calendar.getInstance();
        
        
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.YEAR));
        
        System.out.println("****************************");
        
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        
        
        
        
    }
}
