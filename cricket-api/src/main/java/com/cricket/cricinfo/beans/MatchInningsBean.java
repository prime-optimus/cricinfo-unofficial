package com.cricket.cricinfo.beans;

import java.util.List;

import com.cricket.annotations.IteratedSelector;

public class MatchInningsBean {
	
	@IteratedSelector(selector="tbody:has(.th-sr) tr:not([class])")
	private List<BattingCardBean> batting;
	
	@IteratedSelector(selector=".fowLink span", scope="local")
	private List<FallOfWicketsBean> fow;
	
	@IteratedSelector(selector="tbody:has(.th-econ) tr:not([class])")
	private List<BowlingCardBean> bowling;
	
	@IteratedSelector(selector=".to-bat .bold", scope="local")
	private List<DidNotBatBean> dnb;

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

	public List<DidNotBatBean> getDnb() {
		return dnb;
	}

	public void setDnb(List<DidNotBatBean> dnb) {
		this.dnb = dnb;
	}
}
