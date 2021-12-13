package demo.simple;

import java.util.Date;

public class Employee {
	
	public Employee() {
		//empty constructor
	}

	private int id;
	
	private String name;
	
	private Date dateHired;
	
	private boolean managerFlag;
	
	private boolean partTimeFlag;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public boolean isManagerFlag() {
		return managerFlag;
	}

	public boolean isPartTimeFlag() {
		return partTimeFlag;
	}

}
