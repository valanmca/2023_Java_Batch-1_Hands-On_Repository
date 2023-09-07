package com.mahesh.Oops_day9;
class box
{
	int l,b,w;
	
	
	box(int l,int b,int w)
	{
		this.l =l;
		this.b=b;
		this.w = w;
	}
	
	int getvolume()
	{
		int volume =l*b*w;
		return volume;
	}
	int getarea()
	{	int area=l*b;
		return area;
		
	}
	void disp()
	{
		System.out.println("length is :"+l);
		System.out.println("breath is :"+b);
		System.out.println("width is :"+w+"\n");
		System.out.println("Volume is :"+getvolume());
		System.out.println("Area is :"+getarea());
		
	}
}
public class BoxClass {
	
	
	
	public static void main(String[] args) {
	
		box red_box = new box(3,4,5);
		red_box.disp();
	}

}
