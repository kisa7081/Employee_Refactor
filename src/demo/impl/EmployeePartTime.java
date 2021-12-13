package demo.impl;

import java.util.Date;

public class EmployeePartTime  extends EmployeeAbstract {
	
	private static String I_AM_A_PART_TIME_EMPLOYEE = "I am a part time employee ";

	public EmployeePartTime(int id, String name, Date dateHired) {
		super(id, name, dateHired);
	}

	@Override
	public boolean isManagerFlag() {
		return false;
	}

	@Override
	public boolean isPartTimeFlag() {
		return true;
	}

	@Override
	protected String getStatus() {
		return I_AM_A_PART_TIME_EMPLOYEE;
	}

}
