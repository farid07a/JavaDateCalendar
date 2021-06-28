/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parsing_date_String_values;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javadatecalendar.DF;

/**
 *
 * @author horizon
 */
public class parsing_text {
    
    public static void main(String[] args) {
        String Dats="10/11/20";
        
        SimpleDateFormat simDat=new SimpleDateFormat("dd/MM/yy");
        
        try {
            
            Date dt=simDat.parse(Dats);
            
            System.out.println("The Date is:"+DF.LongD.format(dt));
        } catch (ParseException e) {
            System.out.println("Exception : "+e.getMessage());
            
        }
    }
    
}
