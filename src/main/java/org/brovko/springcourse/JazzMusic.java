package org.brovko.springcourse;

import org.springframework.stereotype.Component;

public class JazzMusic implements Music {
	@Override
	public String getSong() {
		return "what a wonderful world";
	}
}
