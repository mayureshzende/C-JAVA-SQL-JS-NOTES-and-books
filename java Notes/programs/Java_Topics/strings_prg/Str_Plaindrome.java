package strings_prg;

public class Str_Plaindrome {
public static void main(String[] args) {
	String s="nitiin";
	
	char[] c=s.toCharArray();
	for(int i=0,j=c.length-1;i<j;i++,j--)
	{
		char t=c[i];
		c[i]=c[j];
		c[j]=t;
	}
	String s1=new String(c);
//
	if(isPlaindrome(s, s1)) {
		System.out.println("is plaindrome");
	}
	else
	{
	System.out.println(":not plaindrome");
	}
}

static boolean isPlaindrome(String s,String s1)
{

for(int i=0;i<s.length();i++)
	{
	if(s.charAt(i)!=s1.charAt(i))
	return false;
	}
return true;
}

}