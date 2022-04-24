// package com.test.alternate 

class ArrayAlternate{
	public static void main(String[] args){

		int[] arr = {2, 1, 4, 3, 6, 5, 7};

		int temp = 0;

		for(int i = 0 ; i < arr.length-1 ;  i = i+2 ){
			
			temp  = arr[ i ]  ;
			arr[ i ] = arr[ i + 1 ];
			arr[ i + 1 ] = temp ; 
		}


		for(int i : arr){
			System.out.println(i);
		}
	}
}