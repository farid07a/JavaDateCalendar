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
public class Fields_example01 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        int day=cal.get(Calendar.DAY_OF_WEEK);
        
        if (day==Calendar.FRIDAY || day ==Calendar.SATURDAY) 
            System.out.println("This is WeekEnd");
            
        else System.out.println("Working Day !");
        
        System.out.println("*********************");
        
        int month=cal.get(Calendar.MONTH);
        
        
        if (month==Calendar.JUNE || month==Calendar.JULY || month==Calendar.AUGUST ||month==Calendar.SEPTEMBER) {
            System.out.println("This sezon is summer");   
        }else System.out.println("Not Summer app");
        
    }
   
}
