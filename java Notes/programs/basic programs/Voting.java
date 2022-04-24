class AgeValid extends RuntimeException
{
		AgeValid()
		{
			super(" the age is below 18") ;
		}

		AgeValid(String Message)
		{
			super(Message);
		}
}

class Voting
{
	public static void main(String[] args)
	{
		int age=9;

			
		if(age <18)
		{
			throw new AgeValid(  );
		}
		else 
		{
			System.out.println(" you can vote");
		}


		System.out.println(" exceuted ");
	} 
}