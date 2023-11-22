package com.gayathri.day17Java17Features;

record Team(int id, String batchName, String batchTech) {

	static String javaTech, dotNetTech;

	static {
		javaTech = "Angular";
		dotNetTech = "React";
	}

	public static Team createAngularTeam(int empId, String batchName) {
		return new Team(empId, batchName, javaTech);
	}

	public static Team createReactTeam(int empId, String batchName) {
		return new Team(empId, batchName, dotNetTech);
	}
}

public class P6RecordClass2 {
	public static void main(String args[]) {

		Team team1 = Team.createAngularTeam(101, "B1");
		System.out.println(team1);
		
		Team team2 = Team.createReactTeam(102, "B2");
		System.out.println(team2);
	}

}
