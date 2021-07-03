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
public class Month_Calendar_show {
    
    
    public static  void PrintMonth(int m ,int y){
    
        Calendar jumping=Calendar.getInstance();
        jumping.set(Calendar.DATE, 1);
        jumping.set(Calendar.MONTH, --m);
        jumping.set(Calendar.YEAR, y);
        
        Calendar last=Calendar.getInstance();
        
        last.set(Calendar.MONTH, jumping.get(Calendar.MONTH)+1);//month septemb
        last.set(Calendar.DATE, 0);//last date of before month date 31 out
        
        System.out.println("Date is:"+DF.MeduimD.format(last.getTime()));
        
        System.out.println("MONTH OF September ");
        System.out.println("=======================");
        System.out.println("Sat  Sun  Mon  Tue  Wed  Thu  Fri");
        System.out.println("---  ---  ---  ---  ---  ---  ---");
        
        int maxDayInMonth=jumping.getActualMaximum(Calendar.DATE);
        if (jumping.get(Calendar.DAY_OF_WEEK)<6) {
            
            for (int i = 0; i < jumping.get(Calendar.DAY_OF_WEEK); i++) {
                System.out.println("   ");
            }
        }
        while (last.get(Calendar.MONTH)== jumping.get(Calendar.MONTH)) {  
            System.out.printf("%-5d",jumping.get(Calendar.DATE));
            if (jumping.get(Calendar.DAY_OF_WEEK)%6==0  && jumping.get(Calendar.DATE)!= maxDayInMonth) {
                System.out.println("");
            }
            
            jumping.add(Calendar.DATE, 1);
            
        }
        System.out.println("------------------------");
    }
    
    public static void main(String[] args) {
        Month_Calendar_show.PrintMonth(7, 2021);
        
    }
}
