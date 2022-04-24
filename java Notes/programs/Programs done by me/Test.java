
import java.util.*;
import java.util.regex.*;

public class Test {
	public static void main(String[] args) throws Exception {
		
	
//		int[] arr= { 1, 2, 3, 2, 4, 5, 5, 7, 8, 1};



int[] arr= { 1, 2, 3, 4, 5, 10, 70, 18, 11};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
System.out.println(arr[arr.length-2]);


		HashSet h=new HashSet();


		for ( int i = 0 ; i < arr.length ; i++ )
		{
			for( int  j=0 ; j< arr.length-1 ; j++ )
			{
				if( arr [ i ] == arr[j] && (i != j ) ) 
				{
					//System.out.println(" duplicate element " + arr [ j ]);  
					h.add(arr[j]);
				} 
			}
		}

		System.out.println(h);

		cal(3,5,"add");

	}
	public static void cal(int num1,int num2,String op)
	{
		String s=op;
		s(num1,num2);
	}

	public static void add(int num1,int num2)
	{
		System.out.println(num1+num2);
	}

}

/**
 * int[] x=new int[3]; System.out.println(x); System.out.println(x[2]);
 * //System.out.println(x[0][0]); String[] s= {"mayu","ke"}; Object[] o=s;
 * ========================================== static int a=10; int x; public
 * static void main(String[] args) { Test t=new Test(); t.x=20;
 * System.out.println(t.x);//20 System.out.println(a);//10 a=30;
 * System.out.println(a);//30 Test t1=new Test(); System.out.println(t1.x);//0
 * System.out.println(t1.a);//30 ==========================================
 * 
 * 
 * Scanner sc=new Scanner(System.in); System.out.println("enter the Nubmer");
 * 
 * int n=sc.nextInt(); int n1=0,n2=1;
 * 
 * System.out.print(n1+" "+n2+" "); while(n>2) { int fib=n1+n2;
 * System.out.print(fib+" "); n1=n2; n2=fib; n--; }
 * 
 * sc.close(); ========================================= static int st; int l;
 * public static void main(String[] args) {
 * 
 * 
 * // \u000d System.out.println("hello"); char i='\uface'; int a;
 * 
 * 
 * System.out.println(st); Test t=new Test(); System.out.println(t.l);
 * 
 * ++++++++++++++++++++++++++++++++++++++++++++========== //icreement decrement
 * 
 * ===========bubble sort======
 * char a='z'; --a; --a; System.out.println(a);
 * 
 * 
		int[] ar = { 3, 12, -5, 6, 34, -6, 32 };// 3,-5,12,6,34,-6,32 => 3,-5,6,12,34,-6,32 => 3,-5,6,

		for (int i = ar.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++)
				if (ar[j] > ar[j + 1]) {
					swap(ar, j, j + 1);
					System.out.printf(" %d and %d is swaped in position %d and %d at i iteration %d  ", ar[j],
							ar[j + 1], j, j + 1, i);
					System.out.println();
				}
			System.out.println("--- ");
		}

		for (int a = 0; a < ar.length; a++) {
			System.out.println(ar[a]);
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
 * 
 * 
 * 
 */