package com.cricket.cricinfo.live.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.cricket.annotations.IteratedSelector;

@XmlRootElement
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
