import java.util.regex.*;

class EmailValidate
{
	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m=p.matcher(args[0]);

		if(m.find() && m.group().equals(args[0]))
		{
			System.out.println(" valid mail id ");
		}
		else
		{
			System.out.println(" invalid mail id ");
		}
	}
}