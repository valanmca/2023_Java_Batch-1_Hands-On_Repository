package com.core.sealed;
record Team(int id, String Bacthname,String Teach) {
	static String javaTech ,DotnetTech;
		static{
			javaTech ="Angualr";
			DotnetTech ="Rect";
			
		}
	
	
	public static Team CreateAngularTeam(int Empid,String Batchname) {
		return new Team(Empid,Batchname,DotnetTech);
		
	}
	public static Team CreateReactTeam(int Empid,String Batchname) {
		return new Team(Empid,Batchname,javaTech);
		
	}
}
public class ex3 {
	public static void main(String[] args) {
		Team team1 =Team.CreateAngularTeam(101, "Batch1");
		System.out.println();
		Team team2 =Team.CreateAngularTeam(303, "Batch2");
		System.out.println();

		
		
	}

}
