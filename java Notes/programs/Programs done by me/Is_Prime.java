package basic_programs;

public class Is_Prime {

	public static void main(String[] args) {
	isprime(3);
	isprime(4);
		
		
	}
public static void isprime(int n) {
	int m=n/2,flag=0;
	
	if(n==1 && n==0)
	{
		System.out.println(n+ " not prime");
	}
	else
	{
		for(int i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a prime no");
				flag=1;
				break;
			}
		}
	}
	
	if(flag==0)
	{
		System.out.println(n+" is prime");
	}
			
}
}
