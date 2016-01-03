package com.cricket.cricinfo.beans;

import com.cricket.annotations.SimpleChildSelector;
import com.cricket.annotations.TableTextSelector;
import com.cricket.annotations.TextSelector;

public class BattingCardBean {
	
	@SimpleChildSelector(selector="tbody:has(.total-wrap)")
	private InningsSummaryBean summary;
	
	@SimpleChildSelector(selector="td:eq(1)")
	private PlayerBean player;
	
	@TextSelector(selector="td:eq(2)")
	private String status;
	
	@TextSelector(selector="td:eq(3)")
	private String runs;
	
	@TableTextSelector(selector="td" , heading=".th-m", adjustment=1)
	private String minutes;
	
	@TableTextSelector(selector="td" , heading=".th-b", adjustment=1)
	private String balls;
	
	@TableTextSelector(selector="td" , heading=".th-4s", adjustment=1)
	private String fours;
	
	@TableTextSelector(selector="td" , heading=".th-6s", adjustment=1)
	private String sixes;
	
	@TableTextSelector(selector="td" , heading=".th-sr", adjustment=1)
	private String strikeRate;

	public InningsSummaryBean getSummary() {
		return summary;
	}

	public void setSummary(InningsSummaryBean summary) {
		this.summary = summary;
	}

	public PlayerBean getPlayer() {
		return player;
	}

	public void setPlayer(PlayerBean player) {
		this.player = player;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
