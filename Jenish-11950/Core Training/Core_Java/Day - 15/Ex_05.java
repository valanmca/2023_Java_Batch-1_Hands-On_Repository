package com.jenish.day15;

record Team(int id,String Batchname, String Tech) {
	static String javaTech, dotnetTech;
	static {
		javaTech = "Angualr";
		dotnetTech = "React";
	}
	public static Team createAngularTeam(int Empid, String Batchname) {
		return new Team(Empid, Batchname, javaTech);
	}
	
	public static Team createReactTeam(int Empid, String Batchname) {
		return new Team(Empid, Batchname, dotnetTech);
	}
}

public class Ex_05 {

	public static void main(String[] args) {
		Team team1 = Team.createAngularTeam(101, "Batch 1");
		System.out.println(team1);
		Team team2 = Team.createReactTeam(102, "Batch 2");
		System.out.println(team2);
	}

}
