package demo.main;

import java.util.Date;

import demo.factory.EmployeeFactory;

public class Main {

	public static void main(String[] args) {
		System.out.println(EmployeeFactory.createEmployee(EmployeeFactory.EmployeeEnum.EMPLOYEE, 1, "Tom", new Date()));
		System.out.println(EmployeeFactory.createEmployee(EmployeeFactory.EmployeeEnum.MANAGER, 2, "Dick", new Date()));
		System.out.println(EmployeeFactory.createEmployee(EmployeeFactory.EmployeeEnum.PARTTIME, 3, "Harry", new Date()));
	}
}
