package com.pga;

import javax.persistence.*;

@Entity(name="student")
public class Student {
	@Id
	@Column(name="rollNo")
	private int rollNo;
	
	@Column(name="name")
	private String name;
	
	@Column(name="marks")
	private float marks;

	public Student() {}

	public Student(int rollNo, String name, float marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]\n";
	}
	
}
