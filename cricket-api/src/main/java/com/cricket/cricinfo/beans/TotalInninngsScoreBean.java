package com.cricket.cricinfo.beans;

import com.cricket.annotations.TextSelector;

public class TotalInninngsScoreBean {
	
	@TextSelector(selector=".bold")
	private String score;
	
	@TextSelector(selector=".total-details", regex="(?<=;)\\s\\d+")
	private String overs;
	
	@TextSelector(selector=".total-details", regex="(?<=\\()\\d+")
	private String wickets;
	
	@TextSelector(selector=".total-details", regex="dec")
	private String declared;

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getOvers() {
		return overs;
	}

	public void setOvers(String overs) {
		this.overs = overs;
	}

	public String getWickets() {
		return wickets;
	}

	public void setWickets(String wickets) {
		this.wickets = wickets;
	}

	public String getDeclared() {
		return declared;
	}

	public void setDeclared(String declared) {
		this.declared = declared;
	}
	
}
