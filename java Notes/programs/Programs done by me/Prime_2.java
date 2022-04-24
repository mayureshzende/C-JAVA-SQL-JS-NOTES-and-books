package basic_programs;

public class Prime_2 {

	public static boolean isPrime(int n) {
	if(n<=1)
	{
		return false;
		
	}
	for(int i=2;i<=Math.sqrt(n);i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
	
	}
	
public  void primeno(int st,int en)
{
	int count=0;
	for(int i=st;i<=en;i++)
	{
	if(isPrime(i))
	{
		System.out.println(i+" is prime");
		
		count++;
		
	}
	
	//else 
	//{
		//System.out.println(i+" is not prime");
	//}
}
	
	System.out.println(count);
	
}
public static void main(String[] args) {
//	int n=4;
   Prime_2 p=new Prime_2();
   p.primeno(1,50);
   
  // System.out.println(Math.sqrt(2));
}

}
