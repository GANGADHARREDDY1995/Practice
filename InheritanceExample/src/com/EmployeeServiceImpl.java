package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class EmployeeServiceImpl implements PersonService {

	private static EmployeeServiceImpl employeeServiceImpl;
	
	private EmployeeServiceImpl() {
		
	}
	
	public static EmployeeServiceImpl getEmployeeServiceImplInstance() {
		if(employeeServiceImpl == null) {
			employeeServiceImpl = new EmployeeServiceImpl();
		}
		return employeeServiceImpl;
	}
	
	private static List<Person> employeeList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	@Override
	public void register() {
		Employee employee = new Employee();
		System.out.println("enter the employee id");
		employee.setEmployeId(scanner.nextInt());
		System.out.println("enter the employee name");
		employee.setEmployeName(scanner.next());
		System.out.println("enter the employee company");
		employee.setEmployeCompany(scanner.next());
		System.out.println("enter the employee salary");
		employee.setEmployeSalary(scanner.nextLong());
		employeeList.add(employee);
	}

	@Override
	public List<Person> display() {
		System.out.println("Id \t Name \t Company \t Salary");
		for (Person person : employeeList) {
			Employee employee = (Employee) person;
			System.out.print(employee.getEmployeId() + " \t");
			System.out.print(employee.getEmployeName() + " \t");
			System.out.print(employee.getEmployeCompany() + " \t");
			System.out.print(employee.getEmployeSalary());
			System.out.println();
		}
		return employeeList;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("you can not clone this object");
	}
}
