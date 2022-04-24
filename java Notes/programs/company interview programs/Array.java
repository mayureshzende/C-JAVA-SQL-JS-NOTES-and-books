import java.util.*;

class Array{
	public static void main(String[] args){
		
		System.out.println();
		
		long[]  fib = fibo(2);
		// System.out.println(" " + Arrays.toString(fib));
		
		System.out.println(Arrays.toString(fib));

		for(long l : fib)
		{
			System.out.println(l + " ");
		}
	
	}

	public static long[] fibo(int arr){
		long[] f = new long[arr] ;

		f[0 ] = f [1] = 1 ;

		for(int i =2 ;i<f.length ; i++ ){
			f[ i ] = f [ i - 1] + f [i - 2]; 
		}

		return f;
	}


}


/*
int[] arr = {1, 2, 3, 4, 5};


		System.out.println("original array ");
		for(int e: arr ){
			System.out.print(e + " ");
		}	


====== square arrray ===============
static int[] sqr(int[] arr){

		int[] rev = new int[arr.length];
		for(int  i =0 ; i< arr.length ; i++)
		{
			rev[ i ] = arr [ i ] * arr [ i ]; 
		}

		return rev;
	}


	======================= rev the array =======================
		public static int[] rev(int[] arr){
		int[] rev = new int[arr.length];


		for(int i =0 , j = arr.length -1 ; i<j ; j--, i++){
				int temp = arr[i ];
				arr[ i ] = arr [ j ];
				arr[ j ] = temp ; 
		} 
	return arr;
	}
*/