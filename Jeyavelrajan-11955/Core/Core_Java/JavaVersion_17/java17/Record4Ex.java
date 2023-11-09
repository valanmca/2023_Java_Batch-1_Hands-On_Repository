package com.jeyavel.core.java17;

record Team(int id,String BatchName,String Tech) {
	static String javaTech,DotNetTech;
	static {
		javaTech="Angular";
		DotNetTech="React";
	}
	
//	public static Team createAngularTeam(int Empid,String ProjectName) {
//		return new Team(Empid,BatchName,javaTech);
//	}
//	public static Team createReactTeam(int Empid,String ProjectName) {
//		return new Team(Empid,BatchName,javaTech);
//	}
}



public class Record4Ex {

	public static void main(String[] args) {
	

	}

}
