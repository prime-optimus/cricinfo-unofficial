package com.cricket.cricinfo.beans;

import com.cricket.annotations.TextSelector;

public class BattingCardBean {
	
	@TextSelector(selector="td:eq(1)")
	private String playerName;
	
	@TextSelector(selector="td:eq(2)")
	private String currentStatus;
	
	@TextSelector(selector="td:eq(3)")
	private String runs;
	
	@TextSelector(selector="td:eq(4)")
	private String minutes;
	
	@TextSelector(selector="td:eq(5)")
	private String balls;
	
	@TextSelector(selector="td:eq(6)")
	private String fours;
	
	@TextSelector(selector="td:eq(7)")
	private String sixes;
	
	@TextSelector(selector="td:eq(8)")
	private String strikeRate;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getRuns() {
		return runs;
	}

	public void setRuns(String runs) {
		this.runs = runs;
	}

	public String getMinutes() {
		return minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public String getBalls() {
		return balls;
	}

	public void setBalls(String balls) {
		this.balls = balls;
	}

	public String getFours() {
		return fours;
	}

	public void setFours(String fours) {
		this.fours = fours;
	}

	public String getSixes() {
		return sixes;
	}

	public void setSixes(String sixes) {
		this.sixes = sixes;
	}

	public String getStrikeRate() {
		return strikeRate;
	}

	public void setStrikeRate(String strikeRate) {
		this.strikeRate = strikeRate;
	}
	
	
}
