package basic_programs;

import java.util.Scanner;

public class Binary_Conversion {
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	

	System.out.println("enter the number tto converet it into binary");
	int n=sc.nextInt();
	String s="";
	while(n>0)
	{
		int a=n%2;

		s=a+s;
		n=n/2;
		
		
		

	}
	System.out.print(s);
	sc.close();
}

}