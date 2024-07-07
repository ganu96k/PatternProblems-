package pattern_NumberIncreased_perimid;


//Java Program to print pattern
//Number triangle pattern
import java.util.*;

public class Triangal_Number  {
 // Function to demonstrate pattern
 public static void printPattern(int n)
 {
    int i ,j;
     for (i =1 ; i<=n-1;i++) {
    	 
    	 
    	 for( j =1 ; j<n-i;j++) {
    		 System.out.print(" ");
    	 }
    	 
    	 
    	 for(j =1;j<=i;j++)	{
    		System.out.print(i+" ");
    	 }
    	 
    	 
    	 System.out.println();
     }
 }

 // Driver Function
 public static void main(String args[])
 {
     int n = 6;
     printPattern(n);
 }
}
