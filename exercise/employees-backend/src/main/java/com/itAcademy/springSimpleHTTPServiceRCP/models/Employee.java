package com.itAcademy.springSimpleHTTPServiceRCP.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee 
{	
	private @Id @GeneratedValue Long id;
	private String name;
	private CompanyRoles role;
	private String roleDescription;
	private double salary;
	
	Employee() 
	{		
	}
	
	Employee(String name, CompanyRoles role, String roleDescription, double salary) throws Exception 
	{
	    this.name = name;
	    this.role=role;
	}

	//--------------------Getters & Setters--------------------
	
	public Long getId() 
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public CompanyRoles getRole() 
	{
		return role;
	}

	public void setRole(CompanyRoles role) 
	{
		roleDescription=role.getCompanyRole();
		salary=role.getCompanySalary();
		this.role=role;
	}

	public String getRoleDescription() 
	{
		return roleDescription;
	}

	public void setRoleName(String roleDescription) 
	{
		this.roleDescription = roleDescription;
	}

	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
}