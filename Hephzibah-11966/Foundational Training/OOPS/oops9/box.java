package oops9;

public class box {
	float height;
	float width;
	float breadth;
	float vol;
	float area;
	
	box(float height, float width, float breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	float getvolume() {
		vol=height*width*breadth;
		return vol;
	}
	float getarea() {
		area=breadth*height;
		return area;
	}
	void display() {
		System.out.println(getvolume());
		System.out.println(getarea());
	}

	public static void main(String[] args) {
		box obj=new box(10.2f, 5.5f, 2.4f);
		obj.display();
		

	}

}
