package placement;
import java.util.*;
public class Factorial 
{
	 
	     public static void main(String[] args)  
	     {
	         
	    	  Scanner sc=new Scanner(System.in);
	 System.out.println("neter ete number");
	    	  int n=sc.nextInt();
	            
	   
	    System.out.println(fact(n));    

	    }
	    static int fact(int n){
	    
	    if(n==1)
	        
	        {
	            
	            return 1;
	        }
	        return n*fact(n-1);
	        
	        
	    }
}
	   
	    	 
	    	 //	    	 long fact=3,fact1=6;
//	  
//	     Fact(fact);
//	     Fact(fact1);
//	     
//	     }   	            
//	  public static void Fact(long n) 
//	  {           
//		  
//	  
//        long f=1;
//	         
//	             for(int i=1;i<=n;i++)
//	          {
//	             f=f*i;
//	          }
//	  
//	             System.out.println(f);
//	   }
	  	 




