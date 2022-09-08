package com.yash.springioc.question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrwaShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/springioc/question3/shapeconfig.xml");
		Triangle tri=(Triangle) context.getBean("tri");
		Rectangle rec=(Rectangle) context.getBean("rec");
		Parallelogram para=(Parallelogram) context.getBean("para");
		
		tri.draw();
		rec.draw();
		para.draw();
	}

}
