package practice;

public class ConstructorExample 
{
	
	ConstructorExample()
	{
		System.out.println( "main class constur" );
	}
public static void main(String[] args) 
  {
 
new emp();	

new emp(10,20);
	
	
  }	
}

 class emp
 	{
	  
	emp()
	{
		System.out.println(" Default Cons*****");
	}
	
	emp(int a,int b)
	{
		System.out.println(a + b);
	}
	
	}
	
	

