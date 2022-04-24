import java.util.*;

class DecToBinary
{
	public static void main(String[] args)
	{
		int number = 5;
	
		int rem = 0 ;
		int[] bin=new int[64];
		 while( number > 0 )
		 {
		 	bin[rem++]= number  % 2 ;
		 	
		 	number = number / 2 ;

		 }

		 System.out.print("binary number  is ");
		 for(int i=rem-1 ; i >=0 ; i-- ){
		  System.out.print(bin[i] );
		}

		System.out.println();

		int sum=0 ;
		int no=12345;
		int car=0 ;
		while(no > 0 )
		{
			car = no %10 ;
			sum += car;
			no /= 10;
 		}

 		System.out.println(sum);

		
	}
}
