package com.indus.training.domain;

public class Student {
	private String name;
	private String studentID;
	private static String instructor;

	public Student(String name, String studentID) {
		super();
		this.name = name;
		this.studentID = studentID;

	}

	public String getName() {
		return name;
	}

	public String getStudentID() {
		return studentID;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentID=" + studentID + ", instructor=" + instructor + "]";
	}

}
