package com.cricket.cricinfo.beans;

import com.cricket.annotations.TextSelector;

public class FallOfWicketsBean {
	
	@TextSelector(regex="\\d+-\\d+")
	private String score;
	
	@TextSelector(regex="(?<=\\()[\\w ]+")
	private String player;
	
	@TextSelector(regex="\\d+\\.\\d+")
	private String over;

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getOver() {
		return over;
	}

	public void setOver(String over) {
		this.over = over;
	}
	
}
