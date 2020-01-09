package org.brovko.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {
	
	
	@PostConstruct
	public void doMyInit(){
		System.out.println("doMyInit");
	}
	@PreDestroy
	public void doMyDestroy(){
		System.out.println("doMyDestroy");
	}
	
	@Override
	public String getSong() {
		return "Rhapsody";
	}
	
	public static ClassicalMusic getClassicalMusic(){
		return  new ClassicalMusic();
	}
}
