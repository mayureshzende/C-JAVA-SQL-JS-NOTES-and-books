//package com.ja

import java.util.*;
class StringPrgms {
	public static void main(String[] args){

		String s = "aaabbccdeef";

		// char[] ch = s.toCharArray();

		StringBuilder sb = new StringBuilder();
		StringBuilder sdup =new StringBuilder();
		for(int i = 0 ; i<s.length() ; i++){
			char ch = s.charAt(i);
			int idx = s.indexOf(ch+"");
			int lidx = s.lastIndexOf(ch+"");

			if(idx == lidx ){
				sb.append(ch);
				//break;
			}
			// if(idx == -1 ){
			// 	sb.append(""+ch);

			// }else{
			// 	sdup.append(""+ch);
				
			// }
		}

		System.out.println(sb);	
		System.out.println("duplicates are = "+ sb.charAt(0));

		

	}
}




/*
------------------------ remove the whitespaces in the programs ------------------------
String s = "  a   ab c d ";

		String strim = s.replaceAll("\\s","");
		
		System.out.println(strim);  

------------------------- to replace all special character in the string ------------------
String s = "Pr@(@#)ogramm23423n^#&@g";

		String un = s.replaceAll("[^a-zA-Z]","") ; 
		System.out.println(un);

-------------------------- to replace all reapating character ------------------------------                  
*/