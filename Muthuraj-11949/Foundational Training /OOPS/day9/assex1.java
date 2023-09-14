package com.muthu.day9;
class room {
	int height;
	int width;
	int breath;
	 
	room(int height,int width,int breath)
	{
		this.height= height;
		this.breath =breath;
		this .width =width;
		
	}//method
	void volume() {
		int volume=height*breath*width;
		System.out.println("volume"+volume);
		
	}
	
}

public class assex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		room obj=new room(2,2,2);
		obj.volume();
       

	}

}
