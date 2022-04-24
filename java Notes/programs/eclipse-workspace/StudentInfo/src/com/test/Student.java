package com.test;

public class Student {
private int id;
private String name;
private int age;
private String email;
private float marks;
private float attendance;

Student(){}

public Student(int id, String name, int age, String email, float marks,float attendance) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.email = email;
	this.marks = marks;
	this.attendance=attendance;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public float getMarks() {
	return marks;
}

public void setMarks(float marks) {
	this.marks = marks;
}

public float getAttendance() {
	return attendance;
}

public void setAttendance(float attendance) {
	this.attendance = attendance;
}



}
