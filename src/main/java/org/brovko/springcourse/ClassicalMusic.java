package org.brovko.springcourse;

import org.springframework.stereotype.Component;

@Component("musicBeanClassical")
public class ClassicalMusic implements Music {
	
	private ClassicalMusic() {
	}
	
	public void doMyInit(){
		System.out.println("doMyInit");
	}
	
	public void doMyDestroy(){
		System.out.println("doMyDestroy");
	}
	
	@Override
	public String getSong() {
		return "Rapsody";
	}
	
	public static ClassicalMusic getClassicalMusic(){
		return  new ClassicalMusic();
	}
}
