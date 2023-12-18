package com.jeban.JAVA17;

record Team(int id, String BatchName, String Tech) {

	static String javaTech, DotnetTech;
	static {
		javaTech = "Angular";
		DotnetTech = "Dotnet";
	}
	public static Team CreateAngularTeam(int Empid, String Projectname) {
		return new Team(Empid, Projectname, javaTech);
	}

	public static Team CreateReactTeam(int Empid, String Projectname) {
		return new Team(Empid, Projectname, DotnetTech);
	}
}

public class Project {

	public static void main(String[] args) {
		Team team1 = Team.CreateAngularTeam(101, "Batch 1");
		System.out.println(team1);
		Team team2=Team.CreateReactTeam(201, "Batch 2");
		System.out.println(team2);

	}

}
