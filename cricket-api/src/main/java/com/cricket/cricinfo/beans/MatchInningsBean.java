package com.cricket.cricinfo.beans;

import java.util.List;

import com.cricket.annotations.IteratedSelector;
import com.cricket.annotations.SimpleChildSelector;

public class MatchInningsBean {
	
	@IteratedSelector(selector="tbody:has(.total-wrap) tr:not([class])")
	private List<BattingCardBean> batting;
	
	@IteratedSelector(selector=".fowLink span")
	private List<FallOfWicketsBean> fow;
	
	@IteratedSelector(selector="tbody:has(.th-econ) tr:not([class])")
	private List<BowlingCardBean> bowling;
	
	@IteratedSelector(selector=".to-bat .bold")
	private List<PlayerBean> dnb;
	
	@SimpleChildSelector(selector="tbody:has(.th-sr)")
	private InningsSummaryBean summary;
	
	public List<BattingCardBean> getBatting() {
		return batting;
	}

	public void setBatting(List<BattingCardBean> batting) {
		this.batting = batting;
	}

	public List<FallOfWicketsBean> getFow() {
		return fow;
	}

	public void setFow(List<FallOfWicketsBean> fow) {
		this.fow = fow;
	}

	public List<BowlingCardBean> getBowling() {
		return bowling;
	}

	public void setBowling(List<BowlingCardBean> bowling) {
		this.bowling = bowling;
	}

	public List<PlayerBean> getDnb() {
		return dnb;
	}

	public void setDnb(List<PlayerBean> dnb) {
		this.dnb = dnb;
	}

	public InningsSummaryBean getSummary() {
		return summary;
	}

	public void setSummary(InningsSummaryBean summary) {
		this.summary = summary;
	}
}
