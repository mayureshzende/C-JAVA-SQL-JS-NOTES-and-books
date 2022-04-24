//package com.Lambda.array 
import java.util.*;
import java.util.function.*;
class LambdaArrayPre{
	public static void main(String[] args){
		int[] ar={0, 5, 10, 15, 20, 25, 30};

		Predicate<Integer> p = i -> i%2 == 0 ;
		Predicate<Integer> p2 = l -> l >10; 
		for(int a: ar ){
			if(p.or(p2).test(a)){
				System.out.println(a);
			}
		} 
	}
}