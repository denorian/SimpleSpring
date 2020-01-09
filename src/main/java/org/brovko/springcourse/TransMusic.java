package org.brovko.springcourse;

import org.springframework.stereotype.Component;

@Component("musicBeanTrans")
public class TransMusic implements Music {
	@Override
	public String getSong() {
		return "Tuvan";
	}
}
