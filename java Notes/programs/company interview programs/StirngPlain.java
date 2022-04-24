//package com.string

class StringPlain{
	public static void main(String args[])
	{
		String s = "mam1";

		

		if(isPlaindrome(s)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
	static boolean isPlaindrome(String s ){

		char[] ch = s.toCharArray();

		if(s.length() == 0 ){
			return false;
		}

		for(int i = 0 , j = ch.length-1 ; i<j ; i++ , j--){
			if(ch[ i ] != ch[ j ]){
				return false;
			}
		}
		return true ;
	}

}