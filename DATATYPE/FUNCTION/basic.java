package FUNCTION;
import java.lang.*;
import java.util.*;


public class basic {
    static void vib(){
        int arr[]={1,2,3,4,5};
        int temp[]=new int[arr.length];
        for(int i=1;i<arr.length;i++){
            
            // temp[i]=arr[arr.length-1-i];
            System.out.println(temp[i]);
        }
        System.out.println("number :- "+temp);

    }
    static void vibhu(){
        System.out.println("Satya Singh");
    }
    public static void main(String[] args) {
       
        vib();
        vibhu();
    }

    
        
    
    
}
