package com;

public class Employee extends Person {
	int employeId;
	String employeName;
	String employeCompany;
	long employeSalary;

	@Override
	public String toString() {
		return "Employe [employeId=" + employeId + ", employeName=" + employeName + ", employeCompany=" + employeCompany
				+ ", employeSalary=" + employeSalary + "]";
	}

	public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public String getEmployeCompany() {
		return employeCompany;
	}

	public void setEmployeCompany(String employeCompany) {
		this.employeCompany = employeCompany;
	}

	public long getEmployeSalary() {
		return employeSalary;
	}

	public void setEmployeSalary(long employeSalary) {
		this.employeSalary = employeSalary;
	}
}
