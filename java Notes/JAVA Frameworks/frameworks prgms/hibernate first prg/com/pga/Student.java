package com.pga;

// POJO class
public class Student {
	private int sRollNo;
	private String sName;
	private float sMarks;

	public Student() {
	}

	public Student(int sRollNo, String sName, float sMarks) {
		this.sRollNo = sRollNo;
		this.sName = sName;
		this.sMarks = sMarks;
	}
	public int getsRollNo() {
		return sRollNo;
	}
	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public float getsMarks() {
		return sMarks;
	}
	public void setsMarks(float sMarks) {
		this.sMarks = sMarks;
	}

	public String toString() {
	 return "[RolllNO:" + sRollNo + ", Name:" + sName + ",Marks:" + sMarks + "]\n";
	}
}
