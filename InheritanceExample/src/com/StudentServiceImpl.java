package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class StudentServiceImpl implements PersonService {

	private static StudentServiceImpl studentServiceImpl;
	
	private StudentServiceImpl() {
		
	}
	
	private static List<Person> studentList = new ArrayList<>(); 
	Scanner scanner = new Scanner(System.in);

	
	public static StudentServiceImpl getStudentServiceImplInstance() {
		if(studentServiceImpl == null) {
			studentServiceImpl = new StudentServiceImpl();
		}
		return studentServiceImpl;
	}
	
	@Override
	public void register() {
		Student student = new Student();
		System.out.println("enter the student id");
		student.setStudentId(scanner.nextInt());
		System.out.println("enter the student name");
		student.setStudentName(scanner.next());
		System.out.println("enter the student college name");
		student.setStudentCollege(scanner.next());
		System.out.println("enter the student branch");
		student.setStudentBranch(scanner.next());
		studentList .add(student);
	}

	@Override
	public List<Person> display() {
		System.out.println("Id \t Name \t College \t Branch");
		for (Person person : studentList) {
			Student student = (Student) person;
			System.out.print(student.getStudentId()+" \t");
			System.out.print(student.getStudentName()+" \t");
			System.out.print(student.getStudentCollege()+" \t");
			System.out.print(student.getStudentBranch());
			System.out.println();
		}
		return studentList;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("you can not clone this object");
	}
			
}
