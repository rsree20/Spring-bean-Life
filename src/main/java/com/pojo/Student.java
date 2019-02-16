package com.pojo;

public class Student {

	Student() {
		System.out.println("Student obj created!!");
	}
	
	private int stdId;
	private String name;
	private String collegeName;

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void addCollege() {
		System.out.println("init method addCollege");
		this.collegeName = "Aurora";
	}
	
	public void removeCollege() {
		System.out.println("destroy method addCollege");
		this.collegeName = null;
	}
}
