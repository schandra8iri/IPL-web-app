package in.co.ipl.webapp.utils;

public enum Franchaise {


	RCB("RCB", "**Royal Challengers Bangalore**", "Bangalore"),
	CSK("CSK", "**Chennai Super Kings**", "chennai");
	
	String shortName;
	String name;
	String city;
	
	private Franchaise(String shortName, String name, String city) {

		this.name = name;
		this.shortName = shortName;
		this.city=city;
	}
	
	public static Franchaise getFranchaiseByShortName(String sname){
		for(Franchaise f : Franchaise.values()) {
			if(f.shortName.equalsIgnoreCase(sname)) {
				return f;
			}
		}
		return null;
	}
	
}
