package com.yash.springioc.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springioc.question1.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/springioc/question2/printmsgconfig.xml");
		PrintMessage e=(PrintMessage) context.getBean("print");
		System.out.println(e);
	}

}
