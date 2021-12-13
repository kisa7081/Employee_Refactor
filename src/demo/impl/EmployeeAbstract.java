package demo.impl;

import java.util.Date;

import demo.inter.IEmployee;

public abstract class EmployeeAbstract implements IEmployee {
	
	private static final String ID_TEXT = " My id is ";
	private static final String NAME_TEXT = " My name is ";
	private static final String DATE_HIRED_TEXT = " My hire date was ";
	
	public EmployeeAbstract(int id, String name, Date dateHired) {
		this.id = id;
		this.name = name;
		this.dateHired = dateHired;
	}
	
	private int id;
	
	private String name;
	
	private Date dateHired;
	

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Date getDateHired() {
		return dateHired;
	}
	
	protected abstract String getStatus(); // Not a part of the interface
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getStatus()).append(ID_TEXT).append(getId()).append(NAME_TEXT).append(getName()).append(DATE_HIRED_TEXT)
				.append(getDateHired());
		return sb.toString();
	}


}
