package com.pga;

// Bean class
public class Student {
	private int id;
	private String name;
	private Address add;

	public Student() {}
	public Student(int id, String name, Address add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}
	//Getter + Setter, toString methods
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setID method");

		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setNAME method");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ",address="+add+"]";
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
}
