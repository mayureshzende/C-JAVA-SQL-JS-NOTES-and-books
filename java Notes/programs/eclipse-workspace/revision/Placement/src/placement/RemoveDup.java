package placement;


import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
  


public class RemoveDup {
	
	    public static void main(String[] args) 
	    { 
	        // input list with duplicates 
	    	
	    	String[] str=new String[] {"mayu","abc","mayu","ocean","lmn","opc","lmn"};
	        List<String> list = new ArrayList<>(Arrays.asList(str)); 
	            // Print the Arraylist 
	        System.out.println("ArrayList with duplicates: "
	                           + list); 
	  
	        // Construct a new list from the set constucted from elements 
	        // of the original list 
	        List<String> newList = list.stream() 
	                                      .distinct() 
	                                      .collect(Collectors.toList()); 
	  
	        // Print the ArrayList with duplicates removed 
	        System.out.println("ArrayList with duplicates removed: "
	                           + newList); 
	    } 
	} 



	

