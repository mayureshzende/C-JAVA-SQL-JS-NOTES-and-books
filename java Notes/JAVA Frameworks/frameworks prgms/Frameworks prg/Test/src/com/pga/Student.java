package com.pga;
// Generated Oct 6, 2018 9:19:37 AM by Hibernate Tools 5.3.1.Final

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

	private int rollNo;
	private String name;
	private Float marks;

	public Student() {
	}

	public Student(int rollNo) {
		this.rollNo = rollNo;
	}

	public Student(int rollNo, String name, Float marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return this.rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getMarks() {
		return this.marks;
	}

	public void setMarks(Float marks) {
		this.marks = marks;
	}

}