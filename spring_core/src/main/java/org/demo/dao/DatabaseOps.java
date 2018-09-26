package org.demo.dao;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatabaseOps{
	
 public static void main(String[] args) {
	 System.out.println("loading beans");
	
	 ApplicationContext context = new ClassPathXmlApplicationContext("database.xml");
	 System.out.println("beans loaded");
	 EmployeeDao data = (EmployeeDao)context.getBean("edao");
	 Employee e = new Employee(1728,"praju",1);
	
	/* List<Employee> ls;
	 System.out.println(a);
	ls  = data.getAllEmployee();
	for(Employee emp: ls) {
		System.out.println(emp);
	}
	 System.out.println(a + " rows affected");*/
	 Boolean a =  (Boolean)data.saveEmployeeByPreparedStatement(e);
	 System.out.println(a +" operationd done");
	 
}

}
