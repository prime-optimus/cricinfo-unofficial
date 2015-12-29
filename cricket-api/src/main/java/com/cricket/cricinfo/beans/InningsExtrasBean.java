package com.cricket.cricinfo.beans;

import com.cricket.annotations.TextSelector;

public class InningsExtrasBean {
	
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@TextSelector(selector=".extra-details")
	private String details;
	
	@TextSelector(selector=".bold")
	private String total;
}
