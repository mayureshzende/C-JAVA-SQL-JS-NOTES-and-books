class AgeInvalidException extends Exception
{
	int age;
	AgeInvalidException()
	{}
	AgeInvalidException(int a)
	{
		age=0;
	}

	public String getMessage()
	{
		return " enter the valid age " + age + " is Invalid " ;
	}
}


class UserDefineException 
{
	public static void main( String[] args)
	{
		int age=Integer.parseInt(args[0]);

		try{
		if(validateAge(age))
		{
			System.out.println(" age is valid " + age );
		}
		}catch(AgeInvalidException ax)
		{
			System.out.println(" age is Invalid");
			ax.printStackTrace();
		}
	}

	static boolean validateAge(int age) throws AgeInvalidException
	{
		if(!(age >=1 && age <=100 ))
		{
			throw new AgeInvalidException(age);
		}
		return true;
	}
}