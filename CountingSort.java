//HackeRank:Counting Sort 1
   """ Output number of times each number appears"""

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;


public class Solution {

    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         int a=scan.nextInt(); //100 inputs
        int maxi=0;
        ArrayList<Integer> al= new ArrayList<Integer>(); //identify arraylist as integer
        int s=0; // initialize s
        int b;
        for ( int i = 0; i<a;++i)
            {
              b=scan.nextInt();
             al.add(b);
        }
        
        //System.out.println(al.get(1)); //<- al.get(0) returns value from index
        for ( int i = 0;i<al.size();++i) //get max item of index
            {
            
             if(maxi<al.get(i))
                 {
                 maxi=al.get(i); //I can copy b/c I initialized maxi
             }
        }
        ArrayList<Integer> copy = new ArrayList<Integer>();
        for ( int i =0; i<=maxi;++i)
            {
            copy.add(0); //set everything from copy to zero
        }
        int okay;
        for ( int i =0; i<al.size();++i)
            {
               s=al.get(i);
          
               okay=copy.get(s) +1;
               copy.set(s,okay);  //congrats Alma!
              
              // System.out.println(copy.get(s));
              okay=0;
              
        }
        for ( int i =0; i<maxi+1;++i)
            {
            System.out.print(copy.get(i) + " "); // print for same line and with space!
        }
        
     
        
       
    }
}