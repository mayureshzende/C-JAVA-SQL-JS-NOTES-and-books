import java.util.*;

class BinaryS {
	public static void main(String[] args){

		int[] arr = { 1, 3, 4, 5, 6, 10, 25 };
		int key = 10;

		boolean found = binarySearch(arr, key);
		if(binarySearch(arr, key)){
			System.out.println("element found ");
		}else {
			System.out.println("element not found");
		}

	}

	static boolean binarySearch(int[] arr, int key){
		int start = 0;
		int end = arr.length-1 ;
		int  mid = 0; 

		while( start <= end ){
			mid  = (start + end) / 2 ;
			if(key == arr[ mid ] ){
				return true ; 
			}

			if( key < arr[ mid ] ){
				end = mid - 1 ;
			}else{
				start = mid + 1 ;
			}
		}
		return false ;
	}

	}


	// static void search(int[] arr, int n , int s , int e){




	// 		public void s(int s, int e )
	// 	{
	// 		while( s <= e )

	// 	{ 
	// 		int mid = s + e /2  ;
		
	// 		if(n == arr[ mid ])
	// 			{
	// 				System.out.println(" elemnent found");
	// 				break ;
	// 			}
	// 	 	else if( n <= arr[ mid ])
	// 			{
	// 				s(s, mid-1 );
	// 			}else
	// 			{
	// 				s( mid+1, e);
	// 			}
	// 		}
	// 	}
	// 	// ------------------------------------
	
	// 	// public void s(int s, int e){
	// 	// 	while( s <= e ){
	// 	// 		int mid = (s + e ) / 2; 
	// 	// 		if( n == arr [ mid ]){
	// 	// 			System.out.println(" element found at  " + mid ); 
	// 	// 		}
	// 	// 		if( n < arr [ mid ]){
	// 	// 			s( s , mid -1 );
	// 	// 		}else{
	// 	// 			s(mid + 1 , e );
	// 	// 		}
	// 	// 	}
	// 	// 	if(s > e ){
	// 	// 		System.out.println(" element not  present ");
	// 	// 	}
	// 	// } 

