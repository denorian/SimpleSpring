package org.brovko.springcourse;

import java.util.Random;

public class MusicPlayer {
	private MusicList musicList;
	
	public MusicPlayer(MusicList musicList) {
		this.musicList = musicList;
	}
	
	public String playMusic(){
		int index = (new Random()).nextInt(musicList.getList().size());
		return "Playing: " + musicList.list.get(index).getSong() ;
	}

}
