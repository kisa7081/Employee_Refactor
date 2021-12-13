package demo.impl;

import java.util.Date;

public class Employee extends EmployeeAbstract{
	
	private static String I_AM_AN_EMPLOYEE = "I am an employee ";

	public Employee(int id, String name, Date dateHired) {
		super(id, name, dateHired);
	}

	@Override
	public boolean isManagerFlag() {
		return false;
	}

	@Override
	public boolean isPartTimeFlag() {
		return false;
	}

	@Override
	protected String getStatus() {
		return I_AM_AN_EMPLOYEE;
	}
}
