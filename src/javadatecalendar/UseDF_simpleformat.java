/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatecalendar;

import java.util.Date;

/**
 *
 * @author horizon
 */
public class UseDF_simpleformat {
    
    public static void main(String[] args) {
        
        System.out.println("Date :"+DF.shortD.format(new Date()));
        System.out.println("Date :"+DF.LongD.format(new Date()));
        System.out.println("Date :"+DF.MeduimD.format(new Date()));
        System.out.println("Date :"+DF.LongDate_Time.format(new Date()));
        
    }
    
    
}
