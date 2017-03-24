import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
*  Made by Joao Paulo Knox
*/

public class InsertionSort_Part1 {

    //https://www.hackerrank.com/challenges/insertionsort1
    
    public static void insertIntoSorted(int[] ar) {
        int outer, inner;
        int length = ar.length;
        int value;
        for (outer = 1; outer < length; outer++) {
            value = ar[outer];
            
            shiftDown:
            for (inner = outer; inner > 0; inner--) {
                if (ar[inner-1] > value) {     
                    ar[inner] = ar[inner-1];
                    display(ar);
                } else {
                    break shiftDown;
                }
            }
            ar[inner] = value;
            
        }
        display(ar);
    }
    
    private static void display(int[] ar) {
        int length = ar.length;
        for (int i = 0; i < length; i++) {
                System.out.printf("%d ", ar[i]);
        }
        System.out.printf("\n");
    }
    
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}

