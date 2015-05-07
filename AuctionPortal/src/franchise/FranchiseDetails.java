package franchise;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FranchiseDetails {
	
	@Id
	private String franchiseId;
	
	private String franchiseTeamName;
	private String password;
	private String franchiseOwner;
	private String franchiseCoach;
	private double amountLeft;
	private double amountSpent;
	private boolean valid;
	
	public String getFranchiseId() {
		return franchiseId;
	}
	public void setFranchiseId(String franchiseId) {
		this.franchiseId = franchiseId;
	}
	public String getFranchiseTeamName() {
		return franchiseTeamName;
	}
	public void setFranchiseTeamName(String franchiseTeamName) {
		this.franchiseTeamName = franchiseTeamName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFranchiseOwner() {
		return franchiseOwner;
	}
	public void setFranchiseOwner(String franchiseOwner) {
		this.franchiseOwner = franchiseOwner;
	}
	public String getFranchiseCoach() {
		return franchiseCoach;
	}
	public void setFranchiseCoach(String franchiseCoach) {
		this.franchiseCoach = franchiseCoach;
	}
	public double getAmountLeft() {
		return amountLeft;
	}
	public void setAmountLeft(double amountLeft) {
		this.amountLeft = amountLeft;
	}
	public double getAmountSpent() {
		return amountSpent;
	}
	public void setAmountSpent(double amountSpent) {
		this.amountSpent = amountSpent;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	

}
