package com.bean;

import java.util.Map;

public class IPLTeam
{
	private int team_id;
	private String ownerName,TeamName;
	private Map<String, Player>players;
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	public Map<String, Player> getPlayers() {
		return players;
	}
	public void setPlayers(Map<String, Player> players) {
		this.players = players;
	}
	
	

}
