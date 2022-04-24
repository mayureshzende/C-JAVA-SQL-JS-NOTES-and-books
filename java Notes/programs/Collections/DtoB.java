import java.util.*;

class DtoB {
	public static void main(String[] args){

		// int no=10, j =0;
		// int[] bin=new int[20];
	
		// if(no == 0 )
		// {
		// 	System.out.println("0");
		// }
	
		// while( no != 0)
		// {
		// 	bin[j++] = no % 2;
		// 	no /=2;

		// }

		// for(int i=j-1 ; i>=0; i--)
		// System.out.print(bin[i]);

		int no =255 ,rem =0,j=0 ;

		// int[] hex= new int[20];
		String hex_num="";
		char[] c= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

	while (no != 0 )
	{
		rem = no %16 ;
		hex_num += c[rem];
		no /=16 ;
	}  

	char[] ar= hex_num.toCharArray();
	for(int i = ar.length-1 ; i >=0 ; i--)
	System.out.print(ar[i]);

	}
}