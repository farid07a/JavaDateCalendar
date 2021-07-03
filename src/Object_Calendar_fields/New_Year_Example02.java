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
public class New_Year_Example02 {
    
    
    public static void main(String[] args) {
        
        Calendar cal=Calendar.getInstance();
        
        cal.set(Calendar.YEAR, 2012);
        cal.set(Calendar.DATE, 25);
        cal.set(Calendar.MONTH, 1);
        int firstyear=cal.get(Calendar.YEAR);
        int ii=1;
        for (int i = firstyear ; i <= (firstyear+5); i++) {
            
            cal.set(Calendar.YEAR, i);
            cal.set(Calendar.DATE, 25);
            System.out.println(DF.MeduimD.format(cal.getTime()));
            cal.add(Calendar.DATE, 1);
            System.out.println(DF.MeduimD.format(cal.getTime()));
            System.out.println("indice:"+ii++);
            
            System.out.println("=========================");
        }
        
        
    }
    
}
