package com.pga;

public class Student {
 private int id;
 private String name;
 private float marks;
 
public Student() {}

public Student(int id, String name, float marks) {
	this.id = id;
	this.name = name;
	this.marks = marks;
}

public int getId() {
	System.out.println("In Get ID" );
	return id;
}

public void setId(int id) {
	System.out.println("In SET ID" + id);
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getMarks() {
	return marks;
}

public void setMarks(float marks) {
	this.marks = marks;
}
 
}
