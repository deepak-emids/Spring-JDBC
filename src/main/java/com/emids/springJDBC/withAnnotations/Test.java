package com.emids.springJDBC.withAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(config.class);
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("employeeDao");
		
		int status=dao.saveEmployee(new Employee(1,"deep",50000));
		
		System.out.println(status);
		
	}

}
