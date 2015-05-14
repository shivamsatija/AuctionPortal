package player;

import javax.persistence.Id;

public class PlayerProfile {
	
	@Id
	private String playerId;
	
	private String playerName;
	private String playerAge;
	private String playerNationality;
	private String playerRole;
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(String playerAge) {
		this.playerAge = playerAge;
	}
	public String getPlayerNationality() {
		return playerNationality;
	}
	public void setPlayerNationality(String playerNationality) {
		this.playerNationality = playerNationality;
	}
	public String getPlayerRole() {
		return playerRole;
	}
	public void setPlayerRole(String playerRole) {
		this.playerRole = playerRole;
	}
		
}
