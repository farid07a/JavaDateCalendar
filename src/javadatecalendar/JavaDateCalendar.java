/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatecalendar;

import java.util.Date;

/**
 *
 * @author farid
 */
public class JavaDateCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date date=new Date();
        System.out.println(date.toString());
        System.out.println(new Date());
        Date date2=new Date(86400000);
        System.out.println(date2);
        
        
        
        
    }
    
}
