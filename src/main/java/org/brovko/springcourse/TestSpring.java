package org.brovko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml"
		);

		Computer computer = context.getBean("computer", Computer.class);
		System.out.println(computer.toString());
		context.close();
	}
}
