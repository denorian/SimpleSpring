package org.brovko.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
	@Bean
	public ClassicalMusic classicalMusic() {
		return new ClassicalMusic();
	}
	
	@Bean
	public RockMusic rockMusic() {
		return new RockMusic();
	}
	@Bean
	public JazzMusic jazzMusic() {
		return new JazzMusic();
	}
	
	@Bean
	public MusicPlayer musicPlayer() {
		return new MusicPlayer(musicList());
	}
	
	@Bean
	public MusicList musicList(){
		ArrayList<Music> list = new ArrayList<>();
		list.add(classicalMusic());
		list.add(rockMusic());
		list.add(jazzMusic());
		return new MusicList(list);
	}
}
