package org.brovko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml"
		);
		Music testBean1 = context.getBean("musicBeanClassical", Music.class);
		Music testBean2 = context.getBean("musicBeanRock", Music.class);
		Music testBean3 = context.getBean("musicBeanTrans", Music.class);
		
		System.out.println(testBean1.getSong());
		System.out.println(testBean2.getSong());
		System.out.println(testBean3.getSong());
		context.close();
	}
}
