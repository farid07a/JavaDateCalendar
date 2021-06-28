/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatecalendar;

import java.text.SimpleDateFormat;

/**
 *
 * @author horizon
 */
public class DF {
    
    public static final String formatsValue[]={"dd/MM/yy",
                                "yyyy.MM.dd G 'at' hh:mm:ss Z",
                                "EEE, MMM d, ' ' yy",
                                "h:mm a",
                                "H:mm",
                                "H:mm:ss:SS",
                                "K:mm a, Z",
                                "yyyy.MMMMM.dd GGG hh:mm aaa"
                                };
    
    
    public static final SimpleDateFormat shortD=new SimpleDateFormat(formatsValue[0]);
    public static final SimpleDateFormat LongD=new SimpleDateFormat(formatsValue[1]);
    public static final SimpleDateFormat MeduimD=new SimpleDateFormat(formatsValue[2]);
    public static final SimpleDateFormat shortT=new SimpleDateFormat(formatsValue[3]);
    public static final SimpleDateFormat LongTime=new SimpleDateFormat(formatsValue[4]);
    public static final SimpleDateFormat LongDate_Time=new SimpleDateFormat(formatsValue[4]);
    
    
    
    
    
    
}
