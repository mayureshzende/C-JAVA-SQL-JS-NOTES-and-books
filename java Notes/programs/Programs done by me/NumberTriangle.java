class NumberTriangle
{
	public static void main(String[] args)
	{
		int n=5;
		int sum=1;

		for( int i = 1 ; i <= 5 ; i++ )
		{
			for( int j= 1 ; j <= i ; j++ )
			{
				System.out.print(sum++ + " ");
			} 
			System.out.println();
		}
	}
}