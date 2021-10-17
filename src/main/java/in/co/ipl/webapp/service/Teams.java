package in.co.ipl.webapp.service;

import java.util.ArrayList;
import java.util.List;

import in.co.ipl.webapp.model.Member;
import in.co.ipl.webapp.model.Player;
import in.co.ipl.webapp.model.Team;
import in.co.ipl.webapp.utils.Franchaise;
import in.co.ipl.webapp.model.Person;

public class Teams {
	
	
public List<Team> teamsList = new ArrayList<Team>();
	
	


	public Teams(List<Team> teamsList) {
	// TODO Auto-generated constructor stub#
		this.teamsList = teamsList;
}



	public Teams() {
		// TODO Auto-generated constructor stub
	}



	public List<Team> getTeamList() {
		return teamsList;
	}



	public void setTeamList(List<Team> teamsList) {
		this.teamsList = teamsList;
	}



	@Override
	public String toString() {
		
		String ListOfTeams = "" ;
		
	
		
		  for(Team team : teamsList) {
			  //System.out.println("from Players");
			  
			  //System.out.println(player.toString());
			 // System.out.println(player.getFullName());
			  ListOfTeams =  ListOfTeams.concat(team.toString());
			  ListOfTeams =  ListOfTeams.concat(System.lineSeparator());
			  
			
		}
		 // System.out.println(ListOfPlayers);
		  return ListOfTeams;
	}



	public Team getTeam(String teamname) {
		// TODO Auto-generated method stub
		Team team = new Team();
		List<Player> players = new ArrayList<Player>();
		List<Member> members = new ArrayList<Member>();
		
		players.add(new Player("Mahendra Singh", "Dhoni", 35, Person.Gender.MALE, "Ranchi", Player.role.BATSMAN, true,true,Franchaise.CSK));
		players.add(new Player("Ambatti", "Rayudu", 30,Person.Gender.MALE, "Guntur",Player.role.BATSMAN,false,false,Franchaise.CSK));
		players.add(new Player("Ravindra", "Jadeja", 30,Person.Gender.MALE, "Navagam",Player.role.ALLROUNDER,false,false,Franchaise.CSK));
		players.add(new Player("Ravichandran"," Ashwin", 32,Person.Gender.MALE, "Chenni",Player.role.BOWLER,false,false,Franchaise.CSK));		
		members.add(new Member("Stephen", "Fleming", 40, "NZ", Person.Gender.MALE,Member.role.COACH,Franchaise.CSK));
		members.add(new Member("Tommy", "Simsek", 45, "NZ", Person.Gender.MALE,Member.role.PHYSIO,Franchaise.CSK));

		team.setKnockOut(false);
		team.setNetRunRate(1.78);
		team.setTotalSix(234);
		team.setTeamName(Franchaise.CSK);
		team.setPlayers(players);
		team.setMembers(members);
		
		return team;
	}

	

}
