package org.brovko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml"
		);
		MusicPlayer testBean1 = context.getBean("musicPlayer", MusicPlayer.class);
		MusicPlayer testBean2 = context.getBean("musicPlayer", MusicPlayer.class);
		System.out.println(testBean1);
		System.out.println(testBean2);
		System.out.println(testBean1.getVolume());
		System.out.println(testBean2.getVolume());
		testBean1.setVolume(99);
		System.out.println(testBean1.getVolume());
		System.out.println(testBean2.getVolume());
		context.close();
	}
}
