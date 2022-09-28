package com.pkg;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Employee emp1=new Employee(1,"Aa",30000);
		Employee emp2=new Employee(2,"Bb",30000);
		Employee emp3=new Employee(6,"Cc",29000);
		Employee emp4=new Employee(4,"Dd",32000);
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		Collections.sort(list,(a,b)->{
			if(a.getId()>b.getId()) {
				return -1;
			}
			else
			{
				return 1;
			}
			
		});
		list.forEach(e-> System.out.println(e.getName()));
		
	}

}
