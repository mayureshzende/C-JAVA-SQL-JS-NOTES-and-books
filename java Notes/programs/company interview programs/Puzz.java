//package com.puz
import java.util.*;
class Puzz{
	public static void main(String[] args){
		String s ="mayuresh";

		String ss = String.join(" morning ",s);
		
		System.out.println(ss);


		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

		char[] ch = s.toCharArray();

		for(char c:ch){
			if(hm.containsKey(c)){
				hm.put(c,hm.get(c)+1);
			}else{
				hm.put(c,1);
			}
		}


		for(Map.Entry mp:hm.entrySet()){
			System.out.println(mp.getKey() + "  " + mp.getValue());
		}
	}
}