package com.cricket.cricinfo.live.beans;

import java.util.List;

import com.cricket.annotations.IteratedSelector;

public class RSSFeed {
	
	@IteratedSelector(selector="item")
	List<MatchRSSItem> items;

	public List<MatchRSSItem> getItems() {
		return items;
	}

	public void setItems(List<MatchRSSItem> items) {
		this.items = items;
	}
	
}
