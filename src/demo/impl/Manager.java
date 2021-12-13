package demo.impl;

import java.util.Date;

public class Manager extends EmployeeAbstract{
	
	private static String I_AM_A_MANGER = "I am a manager ";

	public Manager(int id, String name, Date dateHired) {
		super(id, name, dateHired);
	}

	@Override
	public boolean isManagerFlag() {
		return true;
	}

	@Override
	public boolean isPartTimeFlag() {
		return false;
	}

	@Override
	protected String getStatus() {
		return I_AM_A_MANGER;
	}


}
