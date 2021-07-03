/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object_Calendar_fields;

import java.util.Calendar;
import javadatecalendar.DF;

/**
 *
 * @author farid
 */
public class New_Years_example {
    
    public static void main(String[] args) {
        
        Calendar calend=Calendar.getInstance();
        int thisYear=calend.get(Calendar.YEAR);
        
        calend.set(thisYear, 0, 1);
        System.out.println("Decade New Year");
        
        for (int i = thisYear; i < (thisYear+10); i++) {
            
            calend.set(Calendar.YEAR, i);
            System.out.println(DF.MeduimD.format(calend.getTime()));
        }
        
        
        
    }
    
}
