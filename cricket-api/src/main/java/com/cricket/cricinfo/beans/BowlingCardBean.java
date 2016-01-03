package com.cricket.cricinfo.beans;

import com.cricket.annotations.SimpleChildSelector;
import com.cricket.annotations.TableTextSelector;
import com.cricket.annotations.TextSelector;

public class BowlingCardBean {

	@SimpleChildSelector(selector="td:eq(1)")
	private PlayerBean player;
	
	@TableTextSelector(selector="td" , heading=".th-o")
	private String overs;
	
	@TableTextSelector(selector="td" , heading=".th-m")
	private String maidens;
	
	@TableTextSelector(selector="td" , heading=".th-r")
	private String runs;
	
	@TableTextSelector(selector="td" , heading=".th-w[title~=wickets]")
	private String  wickets;
	
	@TableTextSelector(selector="td" , heading=".th-econ")
	private String economy;
	
	@TableTextSelector(selector="td" , heading=".th-w[title~=dot]")
	private String dots;
	
	@TableTextSelector(selector="td" , heading=".th-w[title~=fours]")
	private String fours;
	
	@TableTextSelector(selector="td" , heading=".th-w[title~=sixes]")
	private String sixes;
	
	@TextSelector(selector="td.td-extra")
	private String extras;

	public PlayerBean getPlayer() {
		return player;
	}

	public void setPlayer(PlayerBean player) {
		this.player = player;
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
