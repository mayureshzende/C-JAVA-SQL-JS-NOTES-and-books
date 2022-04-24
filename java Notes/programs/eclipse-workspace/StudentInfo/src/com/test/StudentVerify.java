package com.test;

public class StudentVerify {
	
	public double calAttendance(Student student){
		 double att=0;
		 att=student.getAttendance();
		 return att;
	 }
	 
	 public double calMarks(Student student){
		 double marks=0;
		 String f="failed";

		 if(student.getMarks()<35){
			 System.out.println(f);
			 
		 }else{
			 System.out.println("passed");

		 }
		 return student.getMarks();
	}

	 
	public int calAge(Student student){
		int age = 0;
		if(student.getAge()<0){
			System.out.println("Age cant be negative");
			age=student.getAge();
	}else{
		age=student.getAge();

	}
		return age;

	}

	public int checkAge(Student student){
		int age=0;
		if (student.getAge()>60){
			System.out.println("Age >60 Not Allowed");
			age=student.getAge();
		}
		else{
			age=student.getAge();
		}
		return age;
	}

	public String checkName(Student student){
		String name =null;
		if (student.getName()==null){
			System.out.println("Please enter your name");
			name=student.getName();

		}else{
			name=student.getName();
		}
		return name;

	}
}
