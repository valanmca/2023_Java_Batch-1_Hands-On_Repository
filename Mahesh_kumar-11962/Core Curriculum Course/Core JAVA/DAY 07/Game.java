package com.mahesh.core_java_day_07;
interface playable
{
	void play();
	
}

class volleyball implements playable
{
	public void play()
	{
		System.out.println("i can play vollyball");
	}
}

class Football implements playable
{
	public void play()
	{
		System.out.println("i can play Football");
	}
}

class Basketball implements playable
{
	public void play()
	{
		System.out.println("i can play Basketball");
	}
}
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Football fb = new Football();
		fb.play();
		volleyball vb = new volleyball();
		vb.play();
		Basketball bb = new Basketball();
		bb.play();
		
	}

}
