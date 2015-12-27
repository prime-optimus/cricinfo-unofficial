package com.cricket.cricinfo.beans;

import com.cricket.annotations.TextSelector;

public class DidNotBatBean {
	
	@TextSelector
	private String playerName;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
}
