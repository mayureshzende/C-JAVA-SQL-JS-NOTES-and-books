import java.util.regex.*;

class RegDemo 
{
	public static void main(String[] args)
	{
		int count=0;
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("ababbaba");

		while(m.find())
		{
			count++;
			System.out.println(m.start() +"--"+ m.end() +"--" + m.group());
			
		}
		System.out.println(" the count of matched expression is "+count);
		
	}
}