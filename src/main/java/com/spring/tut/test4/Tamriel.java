package com.spring.tut.test4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Tamriel {

	private Dunmer darkElf;
	private Altmer highElf;

	@Autowired // in order to skip this /\2 (required=false)
	@Qualifier("properName") // if you have extra beans use a qualifier to
								// specify which to use
	public void setDarkElf(Dunmer darkElf) {
		this.darkElf = darkElf;
	}

	@Autowired
	public void setHighElf(Altmer highElf) {
		this.highElf = highElf;
	}

	public void altmerRace() {
		highElf.whatRaceAreYou();
	}

	public void altmerHome(String text) {
		highElf.whereAreYouFrom(text);
	}

	public void dunmerRace() {
		darkElf.whatRaceAreYou();
	}

	public void dunmerHome(String text) {
		darkElf.whereAreYouFrom(text);
	}
}
