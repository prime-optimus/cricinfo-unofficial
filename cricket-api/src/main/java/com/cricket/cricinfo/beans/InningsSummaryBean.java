package com.cricket.cricinfo.beans;

import com.cricket.annotations.SimpleChildSelector;

public class InningsSummaryBean {
	
	@SimpleChildSelector(selector=".extra-wrap")
	private InningsExtrasBean extra;
	
	@SimpleChildSelector(selector=".total-wrap")
	private TotalInninngsScoreBean total;

	public InningsExtrasBean getExtra() {
		return extra;
	}

	public void setExtra(InningsExtrasBean extra) {
		this.extra = extra;
	}

	public TotalInninngsScoreBean getTotal() {
		return total;
	}

	public void setTotal(TotalInninngsScoreBean total) {
		this.total = total;
	}

}
