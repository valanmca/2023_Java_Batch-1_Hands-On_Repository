package oops9;

class room{
	int height;
	int breadth;
	int width;
	
	room(int height, int breadth, int width){
		this.height= height;
		this.breadth=breadth;
		this.width=width;
	}
	
	void volume() {
		int volroom=height*breadth*width;
		System.out.println(volroom);
	}}
public class roomdemo{	
	public static void main(String[] args) {
		room obj=new room(10,5,4);
		obj.volume();
		
	}

}
