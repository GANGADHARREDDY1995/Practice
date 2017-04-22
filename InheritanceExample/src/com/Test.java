package com;

import java.util.Scanner;

public class Test {
	private static final String DISPLAY = "display";
	private static final String REGISTER = "register";
	private static final String STUDENT = "student";
	private static final String EMPLOYEE = "employee";

	public static void main(String[] args) {

		PersonService personService = null;

		Scanner scan = new Scanner(System.in);
		while (true) {
			String module = selectModule(scan);
			String option = selectOption(scan);
			if (module != null && (module.equalsIgnoreCase(STUDENT) || module.equalsIgnoreCase(EMPLOYEE))) {
				personService = getInstanceByModule(personService, module);
				if (option != null && (option.equalsIgnoreCase(REGISTER) || option.equalsIgnoreCase(DISPLAY))) {
					if (option.equalsIgnoreCase(REGISTER)) {
						personService.register();
					}
					if (option.equalsIgnoreCase(DISPLAY)) {
						personService.display();
					}
				} else {
					System.out.println("invalid option selection");
				}
			} else {
				System.out.println("invalid module selection");
			}
		}

	}

	private static PersonService getInstanceByModule(PersonService personService, String module) {
		if (module.equalsIgnoreCase(STUDENT)) {
			if(personService != null && personService instanceof StudentServiceImpl) {
				return personService;
			} else {
				personService = StudentServiceImpl.getStudentServiceImplInstance();
				return personService;
			}
		}
		if (module.equalsIgnoreCase(EMPLOYEE)) {
			if(personService != null && personService instanceof EmployeeServiceImpl) {
				return personService;
			} else {
				personService = EmployeeServiceImpl.getEmployeeServiceImplInstance();
				return personService;
			}
		}
		return personService;
	}

	private static String selectOption(Scanner scan) {
		System.out.println("Available options are::");
		System.out.println("1.Register");
		System.out.println("2.Display");
		System.out.println("Please select one option::");
		return scan.next();
	}

	private static String selectModule(Scanner scan) {
		System.out.println("Avilable moduls are::");
		System.out.println("1.Student");
		System.out.println("2.Employee");
		System.out.println("Please select one module::");
		return scan.next();
	}
	
}
