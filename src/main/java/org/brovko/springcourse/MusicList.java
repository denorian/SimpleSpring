package org.brovko.springcourse;

import java.util.ArrayList;

public class MusicList {
	ArrayList<Music> list;
	
	public MusicList(ArrayList<Music> list) {
		this.list = list;
	}
	
	public void setList(ArrayList<Music> list) {
		this.list = list;
	}
	
	public ArrayList<Music> getList() {
		return list;
	}
}
