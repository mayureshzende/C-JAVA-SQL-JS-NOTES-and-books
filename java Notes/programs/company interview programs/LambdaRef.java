// package com.lambda.reference 

import java.util.*;
// import java.util.funtcion.*;
interface interf 
{
	public void add(int x,int y );
}

class LambdaRef {
	public static void sum(int x ,int y ){
			
				System.out.println("the sum is "+(x+y)) ;
	}

	public static void main(String[] args ){

		// LambdaRef l = new LambdaRef();
		interf i = (a,b) -> System.out.println("the sum is "+ (a+b));
		i.add(10,20);
		

		interf i1 = LambdaRef::sum;
		i1.add(100,200);

		sum(10,10);
		
	}
}