/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure.Collection;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author farid
 */
public class Set_hashSet_Implementation {
    
    public static void main(String[] args) {
        
        HashSet hashSet=new HashSet<String>();// no repetition in items collection
        
        hashSet.add("farid");
        hashSet.add("amine");
        hashSet.add("farid");// set collection not allow to add same value repitition
        hashSet.add("haded");
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1);
        System.out.println(hashSet);
        
    }
    
}
