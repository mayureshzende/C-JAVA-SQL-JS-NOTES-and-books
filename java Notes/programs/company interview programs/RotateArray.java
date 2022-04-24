import java.util.*;

class RotateArray {

	public static void main(String[] args){

		int[] arr = {1, 2, 3, 4, 5, 6, 7};

		int d = 2 ;

		for( int i = 0 ; i < d ; i++ ){

			leftRotate( arr );
		}  

			System.out.println( " " + Arrays.toString(arr));
	}

	static void leftRotate( int[] arr ){

			int i,temp = arr[ 0 ];

			for(  i = 0 ; i < arr.length - 1 ; i++){
				arr[ i ] = arr  [i + 1];
			}
			arr[ i ] = temp ; 
		}
}