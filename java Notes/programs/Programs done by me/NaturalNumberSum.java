class NaturalNumberSum
{
	public static void main(String[] args)
	{
		int n=10;

		int sum= n*(n+1)/2;
		int i=1;
		while ( i <= n)
		{
			System.out.println(i);
			i++;
		}

		System.out.println(sum);
	}
}