// package com.ass.practice 
import java.util.*;
import java.lang.*;

class Assing {
	public static void main(String[] args ){
		String s = "mom";

		// String s1 = "mom";

		if(isPail(s)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	}
	public static boolean isPail(String s1){
		StringBuilder sre =new StringBuilder();
		 sre.append(s1);
		  // /sre.trim();
		return sre.reverse().equals(s1);
	}
}