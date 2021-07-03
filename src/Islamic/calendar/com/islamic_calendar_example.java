/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Islamic.calendar.com;
import com.ibm.icu.text.*;
import com.ibm.icu.util.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
/**
 *
 * @author farid
 */
public class islamic_calendar_example {
    
    
    public static void main(String[] args) {
        ULocale alg_l=new ULocale("ar_kw@calendar=islamic");
        IslamicCalendar islCal=new IslamicCalendar(Locale.UK);
        DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,alg_l);
        SimpleDateFormat simdf=new SimpleDateFormat("dd-MMM-yyyy EEEE",new DateFormatSymbols(alg_l));
        
        try {
            PrintWriter pw;
            pw = new PrintWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("arabic.txt"),"UTF-16"
                    )
            );
            
            for (int i = 0; i < 354; i++) {  //for islamic year calendr 354 day for years
                pw.println(df.format(islCal.getTime()+"\t == \t"+simdf.format(islCal.getTime())));
                
            islCal.add(Calendar.DATE, 1);
            }
            
            pw.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            
            System.err.println("Error in exception"+e.getMessage());
        }
        
        
        
    }
    
    
}
