package com.cricket.cricinfo.live.beans;

import com.cricket.annotations.TextSelector;

public class TeamOneFeed {
	
	@TextSelector(selector = "title", regex="[a-zA-Z ]+?(?=\\d+|v)")
	public String teamName;
	
	
	@TextSelector(selector = "title", regex="\\d+(\\/)*\\d*[\\s\\*]*(?=\\&|v)")
	public String score;
	
	@TextSelector(selector = "title", regex="(?<=\\&)\\s+\\d+\\/\\d+[\\s\\*]*")
	public String score1;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getScore1() {
		return score1;
	}

	public void setScore1(String score1) {
		this.score1 = score1;
	}
}
