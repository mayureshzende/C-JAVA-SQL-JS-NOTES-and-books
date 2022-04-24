//package com.string

class EntireStringRev{
	public static void main(String[] args ) {
		String s = " some is better some is best ";

		String[] sarr = s.split(" ");
		
		for(int  i = 0 , j = sarr.length -1 ; i < j  ;j--, i++){
			String temp = sarr [ i ]; 
			sarr [ i ] = sarr[ j ] ; 
			sarr [ j ] = temp ;  
		}

		// for(String e : sarr){
		// 	System.out.print (e + " ");
		// }

		String s1= String.join(" ",sarr);

		System.out.println(s1);

		String op = "";
		for( String w:sarr){
			op +=rev(w)+" ";
		}
		System.out.println(op);
		 
	}

	public static String rev(String s){
		char[] ch = s.toCharArray();

		for(int i = 0,j= ch.length -1  ;i< j ; i++ , j-- ){
			char t = ch [ i ]; 
			ch [ i ] = ch [ j ]; 
			ch[ j ] = t ;
		}

		return new String(ch);
	}
}