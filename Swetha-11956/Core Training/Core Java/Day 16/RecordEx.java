package com.swetha.features;

record Team(int id,String BatchName,String Tech) {
	static String javaTech,DotnetTech;
	static {
		javaTech="Angular";
		DotnetTech="React";
				
	}
	public static Team createAngularTeam(int Empid,String ProjectName) {
		return new Team(Empid,ProjectName,javaTech);
	}
	public static Team createReactTeam(int Empid,String ProjectName) {
		return new Team(Empid,ProjectName,DotnetTech);
	}
}
public class RecordEx {

	public static void main(String[] args) {
		Team team1=Team.createAngularTeam(101, "Batch 1");
		System.out.println(team1);
		Team team2=Team.createReactTeam(102, "Batch 2");
		System.out.println(team2);
		

		
	}

}
