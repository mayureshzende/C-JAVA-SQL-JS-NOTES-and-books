package practice;


import java.util.*;
	public class TestClass1 {
	    public static void main(String args[] ) throws Exception {
	       
	        Scanner s = new Scanner(System.in);
	      

	       // int num;
	        
	       check(3);
	       check(15);
	        
	        
	        
	  }
	    static void check(int n) 
	    {
	        for(int i=1;i<=n;i++)
	        
	        {
	            if(i%3==0 && i%5==0)
	            {
	                System.out.println("fizzbuzz"+"\n");
	            
	            }else if(i%3==0)
	            {
	                System.out.println("fizz "+"\n");
	            
	            }
	            else if(i%5==0)
	            {
	            
	            System.out.println("buzz"+"\n");
	            
	            }else
	            {
	                {
	                System.out.println(i+"\n");
	            
	            }
	            }
	        }
	        
	    }

	}

