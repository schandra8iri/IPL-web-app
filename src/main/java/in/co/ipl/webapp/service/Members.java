package in.co.ipl.webapp.service;

import java.util.ArrayList;
import java.util.List;

import in.co.ipl.webapp.model.Member;
import in.co.ipl.webapp.utils.Franchaise;

public class Members {
	

	
public List<Member> memeberList = new ArrayList<Member>();
	
	


	public List<Member> getMemberList() {
	return memeberList;
}



public void setMemberList(List<Member> memberList) {
	this.memeberList = memberList;
}



	public Members(List<Member> memberList) {
	// TODO Auto-generated constructor stub#
		this.memeberList = memberList;
}



	public Members() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		
		String ListOfMembers = "" ;
		
		  for(Member member : memeberList) {
			  //System.out.println("from Players");
			  
			  //System.out.println(player.toString());
			//  System.out.println(staffer.getFullName());

			  ListOfMembers =  ListOfMembers.concat(member.toString());
			  ListOfMembers =  ListOfMembers.concat(System.lineSeparator());
			
		}
		 // System.out.println(ListOfPlayers);
		  return ListOfMembers;
	}



	public Members getMembersByTeam(Franchaise teamName) {
		// TODO Auto-generated method stub
		Members subMembers = new Members();
		// TODO Auto-generated method stub
		for(Member member : memeberList) {
			if(member.getFrachaise() == teamName) {
				subMembers.getMemberList().add(member);
			}
		}
		return subMembers;	}

	
	
	}


