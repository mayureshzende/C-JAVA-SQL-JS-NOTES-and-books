//package com.arrays
import java.util.*;
class UserArray
{
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
		Student[] s = new Student[3];
		
		for(int i=0; i<3 ; i++){
		int n = sc.nextInt(); 
		String name = sc.next();
			s[i] = new Student(n ,name);
		}

		System.out.println(Arrays.toString(s));
	}
}

class Student {
	private int i ;
	private String name ;

	Student(){}
	Student(int i, String name){
		this.i=i;
		this.name = name;
	}

	public String toString(){
		return " id is " + i + " name is "+ name ;
		}
}