package com.indus.training.service;

import com.indus.training.domain.Student;

import junit.framework.TestCase;

public class TestStudent extends TestCase {

	public void testStudent() {
		Student s1Obj = new Student("sudheer", "s1");
		s1Obj.setInstructor("ravi");
		Student s2Obj = new Student("venkat", "v1");

		s2Obj.setInstructor("vivek");

		System.out.println(s1Obj);
		System.out.println(s2Obj);
		Student s3Obj = new Student();
		System.out.println(s3Obj);

		
	}
}