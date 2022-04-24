package placement;

import java.util.*;

public class ZeroAndOne {
	  public static void main(String[] args) throws InterruptedException {
	        Scanner sc=new Scanner(System.in);
	        int n1=sc.nextInt();
	         int arr[] = new int[n1]; 
	         
	        for(int i=0;i<arr.length;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        
	        int n = arr.length; 
	  
	        segregate0and1(arr, n); 
	        print(arr, n); 
	    }
	        
	        static void segregate0and1(int arr[], int n) 
	    { 
	        int count = 0; // counts the no of zeros in arr 
	      
	        for (int i = 0; i < n; i++) { 
	            if (arr[i] == 0) 
	                count++; 
	        } 
	  
	        // loop fills the arr with 0 until count 
	        for (int i = 0; i < count; i++) 
	            arr[i] = 1; 
	  
	        // loop fills remaining arr space with 1 
	        for (int i = count; i < n; i++) 
	            arr[i] = 0; 
	    } 
	      
	    // function to print segregated array 
	    static void print(int arr[], int n) 
	    { 
	        System.out.print("Array after segregation is "); 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " ");     
	    } 
	      
	     
	} 
	
	

