class SumOfDigit
{
	public static void main(String[] args)
	{
		int number =12345;
		int sum = 0;
		while(number !=0 ){
			
			int a = number%10;
			sum += a ;	
			number = number/10;

		}
		System.out.println("sum of digit is " + sum);
	}
}