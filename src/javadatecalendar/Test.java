/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatecalendar;
import  java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
/**
 *
 * @author farid
 */
public class Test {

    public static void main(String[] args) {
        
        System.out.println("javadatecalendar.Test.main()");
        
        System.out.println(new Date());
        
        System.out.println("Date"+new Date(24*60*60*1000));
        
        System.out.println(new Date(1));
        
        System.out.println(" Tommorow :"+new Date(new Date().getTime()+(24*60*60*1000))); //today add one day(24*60*60*1000)
    
        System.out.println(new Date(new Date().getTime()+(10*24*60*60*1000)));
        
        System.out.println(""+TimeZone.getDefault());
        
        
        
        SimpleDateFormat sfd=new SimpleDateFormat("y");
        String DateStr=sfd.format(new Date());
        
        System.out.println("pattren y "+DateStr);
        
        
        sfd.applyPattern("yyyy");
        DateStr=sfd.format(new Date());
        System.out.println("pattren yyyy:"+DateStr);
        
        sfd.applyPattern("M");
        DateStr=sfd.format(new Date());
        System.out.println("pattren M:"+DateStr);
        
        sfd.applyPattern("MM");
        DateStr=sfd.format(new Date());
        System.out.println("pattren MM:"+DateStr);
        
        sfd.applyPattern("MMM");
        DateStr=sfd.format(new Date());
        System.out.println("pattren MMM:"+DateStr);
        
        sfd.applyPattern("MMMM");
        DateStr=sfd.format(new Date());
        System.out.println("pattren MMMM:"+DateStr);
        
        sfd.applyPattern("MMMM/y");
        DateStr=sfd.format(new Date());
        System.out.println("pattren MMMM/y:"+DateStr);
        
        String formatsValue[]={"dd.MM.yy","yyyy.MM.dd G 'at' hh:mm:ss Z","EEE, MMM d, ' ' yy",
                               "h:mm a","H:mm","H:mm:ss:SS","K:mm a, Z",
                               "yyyy.MMMMM.dd GGG hh:mm aaa"
                                };
        SimpleDateFormat arrfrm[]=new SimpleDateFormat[formatsValue.length];
        int i=0;
        
        for (int j = 0; j < formatsValue.length; j++) {
         
            arrfrm[j]=new SimpleDateFormat(formatsValue[j]);
        }
        
        
        Date ab=new Date();
        
        
        for (SimpleDateFormat simpleDateFormat : arrfrm) {
            System.out.println("Date is :"+simpleDateFormat.format(ab));
        }
        
//        for (SimpleDateFormat simpleDateFormat : arrfrm) {
//            //simpleDateFormat.applyPattern(formatsValue[i++]);
//        }
    }
}
