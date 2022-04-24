// package com.lambda.function 
import java.util.function.*;
class Student {
	String name;
	int marks;

	Student(String name, int marks){
		this.name = name ;
		this.marks = marks ;
	}

}
class LambdaFun{
	public static void main(String[] args ){
			
		Function<Student,String> f= s ->{
		
			int marks=s.marks;
			String grade="";

			if(marks >80 ) grade = "A";
			else if(marks >60) grade ="first class ";
			else if(marks >50 ) grade = "second class "; 
			else grade = "fail ";
			return grade;
		} ;

		Predicate<Student> p = m -> m.marks > 60; ;


		Student[] s = { new Student("mayur", 82),
						new Student("araa", 64),
						new Student("sak", 52),
						new Student("mayuresh", 92),
						new Student("mna", 42),
						new Student("m", 35)
					  };

		for(Student s1: s ){
			if(p.test(s1)){
			System.out.println(s1.name);
			System.out.println(s1.marks);
			System.out.println(f.apply(s1));
			System.out.println();
			}
		}

	}
}