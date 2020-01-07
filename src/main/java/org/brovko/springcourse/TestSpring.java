package org.brovko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml"
		);
		Music testBean1 = context.getBean("musicBeanClassical", Music.class);
		
		System.out.println(testBean1);
		System.out.println(testBean1);
		context.close();
	}
}
