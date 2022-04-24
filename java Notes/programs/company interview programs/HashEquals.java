//package com.HashEquals

import java.util.*;

class HashEquals {
	public static void main(String[] args){
 
		Student s1 = new Student(""+10, 1 );
		Student s2 = new Student(100+"",1);
		Student s3 = new Student(10+"",1);
		Student s4 =s1;

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s4.equals(s1));


		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());

		Map<Student,String> mp = new HashMap<Student,String>();
		mp.put(s1,""+1);
		mp.put(s3,""+1);


		System.out.println(mp.size());
		System.out.println(mp);

		System.out.println(s1);
		// Integer i = new Integer(10);
		// Integer i1 = new Integer(10);

		// Map<Integer,Integer> hp = new HashMap<Integer,Integer>();
		// hp.put(i,1);
		// hp.put(i1,10);

		// System.out.println(hp.size());
	}
}

class Student {

	String name ;
	int ro ;

	Student(String name ,int ro){
		this.ro = ro ;
		this.name = name ; 
	}

	public boolean equals(Object o ){
		
		if( o == this ) return true; 

		if( o instanceof Student )
		{				
			Student s=(Student)o;
		    String n2 = s.name;
			if( name.equals(n2) && ro == s.ro ){
				return true ;
			}else{
				return false ;
			}
		}
		return false;
	}

	@Override
	public int hashCode(){
		return new Integer(name)+ro;
	}

	// public String toString(){
	// 	return ""+name;
	// }
     

     /* 	public String getNumber(){
		return i;
	}

	public void setNumber(String i){
		this.i = i ;
	}

	// @Override
	// public boolean equals(Object o ){
		
	// 	if( o != null && o instanceof Student ){

	// 		String reg = ((Student)o).getNumber();
			
	// 		if( reg != null && reg.equals(this.getNumber()) ) {
	// 			return true;
	// 		}
	// 	}
	// 	return false;
	// }

	*/
	


}