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
public class Use_Roll {
    
    
    // not change in fieled not passed to next month
    
    public static void main(String[] args) {
        
        Calendar cal=Calendar.getInstance();
        
        Date st;
        
        for (int i = 0; i < 30; i++) {
            
            //cal.roll(Calendar.DATE, true); add with 1
            cal.roll(Calendar.DATE, 5);
            System.out.println(DF.LongD.format(cal.getTime()));
            
        }
        
        
    }
}
