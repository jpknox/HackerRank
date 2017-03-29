import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/lonely-integer

/* Author: jpknox
 *
 */

public class Solution {
     private static int lonelyInteger(int[] a) {
         int outer, key;
         for (outer = 0; outer < a.length-1 && a.length > 1; outer+=2) {
             if (a[outer] != a[outer+1]) break;
         }
        return a[outer];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        
        sort(a);
        //display(a);
        System.out.println(lonelyInteger(a));
    }
    
    private static void sort(int[] array) {
        int outer, inner, key;
        int length = array.length;
        
        for (outer = 1; outer < length; outer++) {
            key = array[outer];
            inner = outer-1;
            while (inner >= 0 && array[inner] > key) {
                array[inner+1] = array[inner];
                inner--;
            }
            array[inner+1] = key;
        }
    }
    
    private static void display(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if (i < array.length-1) stringBuilder.append(", ");
        }
        stringBuilder.append("}");
        System.out.printf("%s\n", stringBuilder.toString());
    }

}
