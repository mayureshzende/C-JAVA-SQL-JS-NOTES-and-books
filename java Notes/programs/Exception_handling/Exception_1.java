package Exceptions_prg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Exception_1 {
public static void main(String[] args)throws IOException
{
	//Scanner sc=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("program is started");
	//String s=br.readLine();
	//System.out.println(s);
	int n1,n2;
	
	try {
		n1=Integer.parseInt(args[0]);
		n2=Integer.parseInt(args[1]);
		
		int div=n1/0;
		System.out.println(div);
	}

	catch(ArrayIndexOutOfBoundsException arrayexception)
	{
		
	System.out.println("Array out of bound exception");
	System.exit(1);
	}
	catch(NumberFormatException numberexception){
		System.out.println(numberexception);
	}
	catch(ArithmeticException arthmeticexception) {
		System.out.println(arthmeticexception);
		
	}catch(Exception e)
	{
	e.printStackTrace();	
	}
		finally {
	
		System.out.println("finally is Ended");

}
	System.out.println("prg ends");
}
}
