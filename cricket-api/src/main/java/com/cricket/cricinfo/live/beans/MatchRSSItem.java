package com.cricket.cricinfo.live.beans;

import com.cricket.annotations.SimpleChildSelector;
import com.cricket.annotations.TextSelector;

public class MatchRSSItem {

	@TextSelector(selector="title")
	public String title;
	
	@TextSelector(selector="guid", regex="\\d+(?=.html)")
	public String matchId;
	
	@SimpleChildSelector
	TeamOneFeed team1;
	
	@SimpleChildSelector
	TeamTwoFeed team2;
	
	@TextSelector(selector="description")
	public String matchDescription;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	public String getMatchDescription() {
		return matchDescription;
	}

	public void setMatchDescription(String matchDescription) {
		this.matchDescription = matchDescription;
	}

	public TeamOneFeed getTeam1() {
		return team1;
	}

	public void setTeam1(TeamOneFeed team1) {
		this.team1 = team1;
	}

	public TeamTwoFeed getTeam2() {
		return team2;
	}

	public void setTeam2(TeamTwoFeed team2) {
		this.team2 = team2;
	}
	
}
