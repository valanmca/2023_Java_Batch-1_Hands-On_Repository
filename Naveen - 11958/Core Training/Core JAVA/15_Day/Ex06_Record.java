package com.naveen.day_15;

record Team(int id, String BatchName, String Tech) {
	
	static String javaTech, DotnetTech;
	static {
		javaTech = "Angular";
		DotnetTech = "React";
	}
	
	public static Team createAngularTeam(int Empid, String BatchName) {
		return new Team(Empid, BatchName, javaTech);
	}
	
	public static Team createReactTeam(int Empid, String BatchName) {
		return new Team(Empid, BatchName, DotnetTech);
	}
	
}
public class Ex06_Record {

	public static void main(String[] args) {
		Team team1 = Team.createAngularTeam(101, "Batch 1");
		System.out.println(team1);
		
		Team team2 = Team.createReactTeam(201, "Batch 2");
		System.out.println(team2);
	}

}
