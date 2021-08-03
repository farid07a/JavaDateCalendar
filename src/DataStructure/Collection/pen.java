/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure.Collection;

import java.util.HashSet;

/**
 *
 * @author farid
 */
public class pen {
    String Color;
    double Volume;

    public pen(String Color, double Volume) {
        this.Color = Color;
        this.Volume = Volume;
    }
    
    @Override
    public String toString(){
    return "["+this.Color+" / "+this.Volume+"]";
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj == null) {
            return false;
        }
        
        if(obj==this) return true;
        
         pen a=(pen) obj;
        
        return this.Color.equals(a.Color) && this.Volume==a.Volume;     //if (this.Color.equals(a.Color) && this.Volume==a.Volume) {
                                                                        //return true;
                                                                        // }else return false
        
    }

    @Override
    public int hashCode() {
        
        Double volumeObj=new Double(Volume);
        return volumeObj.hashCode()+Color.hashCode();
        /*int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.Color);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.Volume) ^ (Double.doubleToLongBits(this.Volume) >>> 32));
        return hash;*/ // generate HashCode 
    }
    
    
    
    public static void main(String[] args) {
        
        HashSet hasSet=new HashSet();
        //System.out.println(new pen("yellow", 3.5));
        
        hasSet.add(new pen("red", 3.3));
        hasSet.add(new pen("green", 3.5));
        hasSet.add(new pen("white", 3.8));
        hasSet.add(new pen("white", 3.3));
        
        System.out.println(hasSet);
        
        
        
        
    }
}
