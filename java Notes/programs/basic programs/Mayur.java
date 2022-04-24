import java.util.*;
class Student {
	int i;
	Student(int i){
		this.i = i; 
	}

	public String toString(){
		return i+" - - " + Integer.toHexString(hashCode());
	}

	public int hashCode(){
		return i;
	}
}
class Mayur{
	public static void main(String[] args){
		Student s=new Student(10);
		System.out.println(s);
	}
}