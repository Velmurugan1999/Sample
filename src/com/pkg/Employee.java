package com.pkg;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Employee {//implements Comparable<Employee>{
	private int id;
	private String name;
	private long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, long salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//@Override
	public int compareTo(Employee o) {
		if(this.getId()>o.getId())
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	
}
