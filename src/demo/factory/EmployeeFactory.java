package demo.factory;

import java.util.Date;

import demo.impl.Employee;
import demo.impl.EmployeePartTime;
import demo.impl.Manager;
import demo.inter.IEmployee;

public class EmployeeFactory {
	
	public enum EmployeeEnum {
		EMPLOYEE,
		MANAGER,
		PARTTIME
}

	public static IEmployee createEmployee(EmployeeEnum e, int id, String name, Date dateHired) {
		switch (e) {
		case EMPLOYEE:
			return new Employee(id, name, dateHired);
		case MANAGER:
			return new Manager(id, name, dateHired);
		case PARTTIME:
			return new EmployeePartTime(id, name, dateHired);
		default : 
			return null;
		}
		
	}
}
