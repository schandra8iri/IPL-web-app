package in.co.ipl.webapp.model;

import java.util.List;

import in.co.ipl.webapp.exception.ZeroSixException;
import in.co.ipl.webapp.service.Members;
import in.co.ipl.webapp.service.Players;
import in.co.ipl.webapp.utils.Franchaise;

public class Team implements ITeam{
	
	public Franchaise teamName =null;
	public int totalSix = 0;
	public double netRunRate = 0.171;
	public boolean isKnockOut = false;
	private List<Player> players;
	private List<Member> members;
	
	public List<Member> getStaff() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public Franchaise getTeamName() {
		return teamName;
	}
	
	//public String[] players;
	
	//public List<String> playersList;
	
	



	/*public List<String> getPlayersList() {
		return playersList;
	}



	public void setPlayersList(List<String> playersList) {
		this.playersList = playersList;
	}*/



	public List<Player> getPlayers() {
		return players;
	}



	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	
	
	public Team(Franchaise teamName, int totalSix, double netRunRate, boolean isKnockOut, List<Player> players, List<Member> members) {
		super();
		this.teamName = teamName;
		this.totalSix = totalSix;
		this.netRunRate = netRunRate;
		this.isKnockOut = isKnockOut;
		this.players = players;
		this.members = members;
	}



	public Team() {
		// TODO Auto-generated constructor stub
	}

	public void setTeamName(Franchaise teamName) {
		this.teamName = teamName;
	}


	public void setTotalSix(int totalSix) {
		this.totalSix = totalSix;
	}

	public double getNetRunRate() {
		return netRunRate;
	}

	public void setNetRunRate(double netRunRate) {
		this.netRunRate = netRunRate;
	}

	public boolean isKnockOut() {
		return isKnockOut;
	}

	public void setKnockOut(boolean isKnockOut) {
		this.isKnockOut = isKnockOut;
	}



	public void printTeams() {
		
		/*System.out.println(teamName);
		
		System.out.println("PLAYERS:");
		
		System.out.println(players[0]);
		System.out.println(players[1]);
		System.out.println(players[2]);
		System.out.println(players[3]);
		
		System.out.println("RCS's Total number of Six is :" + totalSix);
		
		System.out.println("RCS's Net run rate is :" + netRunRate);
		
		System.out.println(" has RCB Knocked out :" + isKnockOut);*/

	}

	@Override
	public String getTotalMatchs() {
		// TODO Auto-generated method stub
		return "Total Matches";
	}

	@Override
	public String getTotalWins() {
		// TODO Auto-generated method stub
		return "Total wins";
	}

	@Override
	public String getTotalSix() {
		// TODO Auto-generated method stub
		//return "Total Six";
		
		if(totalSix>0) {
			return "" + totalSix;
		}else {
			throw new ZeroSixException("ZERO SIX EXCEPTION");
		}
	}

	@Override
	public String getNetRUnRate() {
		// TODO Auto-generated method stub
		return "Total run rate";
	}

}
