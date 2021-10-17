package in.co.ipl.webapp.model;

import in.co.ipl.webapp.utils.Franchaise;

public class Member extends Person{
	
	private role role;
	private Franchaise frachaise;
	
	public Franchaise getFrachaise() {
		return frachaise;
	}



	public void setFrachaise(Franchaise frachaise) {
		this.frachaise = frachaise;
	}




	public enum role{
		COACH,
		PHYSIO
	}
	

	public Member(String fname, String sname, int age, String place, Gender gender, role role, Franchaise frachaise) {
		super(fname, sname, age, place, gender);
		this.role = role;
		this.frachaise = frachaise;
	}



	public Member() {
		// TODO Auto-generated constructor stub
	}



	public role getRole() {
		return role;
	}




	public void setRole(role role) {
		this.role = role;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		
		return super.toString()  + " Role: " + getRole();
				
	
					
					
	}

	
	
	
	}


