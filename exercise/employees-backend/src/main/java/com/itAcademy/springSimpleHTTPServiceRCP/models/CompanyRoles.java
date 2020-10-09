package com.itAcademy.springSimpleHTTPServiceRCP.models;

public enum CompanyRoles 
{
	SECRETARY("Answering phone calls and redirect them when necessary.", 20000),
	DIRECTOR("Directors also handle business mergers, restructuring, or downsizing.", 80000),
	BOSS("Bosses must effectively manage, lead and inspire employees. ", 150000);
	
	private double salary;
	private String roleDescription;
	
	private CompanyRoles(String roleDescription, double salary)
	{
		this.roleDescription=roleDescription;
		this.salary=salary;
	}

	public double getCompanySalary() 
	{
		return salary;
	}

	public void setCompanySalary(double salary) 
	{
		this.salary = salary;
	}

	public String getCompanyRole() 
	{
		return roleDescription;
	}

	public void setCompanyRole(String roleDescription) 
	{
		this.roleDescription = roleDescription;
	}
	
}