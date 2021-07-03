/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure.Collection;
import java.util.TreeSet;

/**
 *
 * @author farid
 */
public class TreeSet_example {
    
    
    public static void main(String[] args) {
        TreeSet <Integer> treSet;
        treSet = new TreeSet();
        treSet.add(20);treSet.add(30);treSet.add(10);treSet.add(10);treSet.add(15);// add values not repetable and ordred
        
        System.out.println(treSet);
        
        System.out.println(treSet.first());
        System.out.println(treSet.last());
        
        int pullfrst=treSet.pollFirst();
        
        System.out.println(pullfrst);
        
        System.out.println(treSet);
        
        
        
    }
    
}
