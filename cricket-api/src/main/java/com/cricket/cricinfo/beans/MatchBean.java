package com.cricket.cricinfo.beans;

import javax.xml.bind.annotation.XmlRootElement;

import com.cricket.annotations.SimpleChildSelector;

@XmlRootElement
public class MatchBean {

	@SimpleChildSelector
	private MatchSummaryBean summary;
	
	@SimpleChildSelector(selector="table.batting-table.innings:eq(0),"+
						".more-match-stats:eq(1),table.bowling-table:eq(2)")
	private MatchInningsBean innings1;
	
	@SimpleChildSelector(selector="table.batting-table.innings:eq(3),"+
						".more-match-stats:eq(4),table.bowling-table:eq(5)")
	private MatchInningsBean innings2;
	
	@SimpleChildSelector(selector="table.batting-table.innings:eq(6),"+
			".more-match-stats:eq(7),table.bowling-table:eq(8)")
	private MatchInningsBean innings3;
	
	@SimpleChildSelector(selector="table.batting-table.innings:eq(9),"+
			".more-match-stats:eq(10),table.bowling-table:eq(11)")
	private MatchInningsBean innings4;

	public MatchSummaryBean getSummary() {
		return summary;
	}

	public void setSummary(MatchSummaryBean summary) {
		this.summary = summary;
	}

	public MatchInningsBean getInnings1() {
		return innings1;
	}

	public void setInnings1(MatchInningsBean innings1) {
		this.innings1 = innings1;
	}

	public MatchInningsBean getInnings2() {
		return innings2;
	}

	public void setInnings2(MatchInningsBean innings2) {
		this.innings2 = innings2;
	}

	public MatchInningsBean getInnings3() {
		return innings3;
	}

	public void setInnings3(MatchInningsBean innings3) {
		this.innings3 = innings3;
	}

	public MatchInningsBean getInnings4() {
		return innings4;
	}

	public void setInnings4(MatchInningsBean innings4) {
		this.innings4 = innings4;
	}
	
}
