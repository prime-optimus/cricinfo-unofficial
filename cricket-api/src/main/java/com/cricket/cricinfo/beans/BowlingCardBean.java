package com.cricket.cricinfo.beans;

import com.cricket.annotations.TextSelector;

public class BowlingCardBean {

	@TextSelector(selector="td:eq(1)")
	private String playerName;
	
	@TextSelector(selector="td:eq(2)")
	private String overs;
	
	@TextSelector(selector="td:eq(3)")
	private String maidens;
	
	@TextSelector(selector="td:eq(4)")
	private String runs;
	
	@TextSelector(selector="td:eq(5)")
	private String  wickets;
	
	@TextSelector(selector="td:eq(6)")
	private String economy;
	
	@TextSelector(selector="td:eq(7)")
	private String dots;
	
	@TextSelector(selector="td:eq(8)")
	private String fours;
	
	@TextSelector(selector="td:eq(9)")
	private String sixes;
	
	@TextSelector(selector="td:eq(10)")
	private String extras;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getOvers() {
		return overs;
	}

	public void setOvers(String overs) {
		this.overs = overs;
	}

	public String getMaidens() {
		return maidens;
	}

	public void setMaidens(String maidens) {
		this.maidens = maidens;
	}

	public String getRuns() {
		return runs;
	}

	public void setRuns(String runs) {
		this.runs = runs;
	}

	public String getWickets() {
		return wickets;
	}

	public void setWickets(String wickets) {
		this.wickets = wickets;
	}

	public String getEconomy() {
		return economy;
	}

	public void setEconomy(String economy) {
		this.economy = economy;
	}

	public String getDots() {
		return dots;
	}

	public void setDots(String dots) {
		this.dots = dots;
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

	public String getExtras() {
		return extras;
	}

	public void setExtras(String extras) {
		this.extras = extras;
	}
	
}
