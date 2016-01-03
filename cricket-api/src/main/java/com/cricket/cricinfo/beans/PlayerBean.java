package com.cricket.cricinfo.beans;

import com.cricket.annotations.TextSelector;

public class PlayerBean {
	
	@TextSelector(selector="a")
	private String playerName;
	
	@TextSelector(selector="a", attribute="href", regex="\\d+(?=\\.html)")
	private String playerId;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	
	
}
