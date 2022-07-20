package com.emids.springJDBC.withXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/emids/springJDBC/applicationContext.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		
		int status=dao.saveEmployee(new Employee(102,"Amit",35000));
		
		System.out.println(status);
		
	}

}
