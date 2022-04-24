//package com.string
import java.util.*;
class SwapAlternateChar {
	public static void main(String[] args){
		// String s = "mayuresh"; 

		int [] arr = {1, 2, 4, 3, 5, 6, 7, 8};
		// for( int i = 0, j =1  ; i < charr.length ; i += 2 , j+=2 ){
		// 	char temp = charr[ i ]; 
		// 	charr[ i ] = charr [ j ];
		// 	charr [ j ] = temp; 
		// }
		// String s1 = new String(charr);

		// System.out.println(s1);

		for( int i=0 ; i<arr.length-1 ; i +=2 ){
			if( arr[ i ] < arr [i+1]){
				int temp = arr[ i ];
				arr[ i ] = arr[ i + 1 ];
				arr[ i+1 ] = temp ;
			}
		}

		System.out.println(Arrays.toString(arr));

		Integer i1=new Integer(1);
		Integer i2=new Integer(1);

		

		Map<Integer,String> hm = new IdentityHashMap<Integer,String>();
		hm.put(i1,"mayuresh");
		hm.put(i2,"test");

		System.out.println(hm);



	}
}