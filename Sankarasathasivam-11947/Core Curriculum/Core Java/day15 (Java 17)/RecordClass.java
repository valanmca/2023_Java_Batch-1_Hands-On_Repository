package com.shiva.core.day15;

record Team(int id, String batchName, String course) {

	static String java = "Angular";
	static String dotNet = "React";

	public static Team createAngularTeam(int empId, String batchName) {
		return new Team(empId, batchName, java);
	}

	public static Team createReactTeam(int empId, String batchName) {
		return new Team(empId, batchName, dotNet);
	}
}

public class RecordClass {

	public static void main(String[] args) {

		Team t1 = Team.createAngularTeam(101, "Batch 1");
		System.out.println(t1);
		Team t2 = Team.createReactTeam(201, "Batch 2");
		System.out.println(t2);

	}

}
