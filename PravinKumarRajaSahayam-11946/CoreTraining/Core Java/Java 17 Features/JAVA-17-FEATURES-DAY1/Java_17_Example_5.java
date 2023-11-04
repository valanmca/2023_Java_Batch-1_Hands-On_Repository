//Java - 17 compact constructor
record Team(int id, String Batchname, String tech) {

	static String javaTech, DotNotTech;
	static {
		javaTech = "Angular";
		DotNotTech = "React";
	}
	public static Team createAngularTeam(int Empid, String BatchName) {
		return new Team(Empid, BatchName, javaTech);
	}
    public static Team createReactTeam(int Empid, String BatchName) {
		return new Team(Empid, BatchName, DotNotTech);
	}
}
public class Java_17_Example_5 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Team team1 = Team.createAngularTeam(101, "Batch-1");
		System.out.println(team1);
		Team team2 = Team.createReactTeam(102, "Batch-2");
		System.out.println(team2);
		Team team3 = Team.createReactTeam(103, "Batch-3");
		System.out.println(team3);
	}
}