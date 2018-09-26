package org.demo.dao;

public class Employee {
	
	public Employee(int empno, String empname, int salary) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.salary = salary;
	}
	private int empno;
	private String empname;
	private int salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return empno + " " + empname + " "+ salary;
	}

}
