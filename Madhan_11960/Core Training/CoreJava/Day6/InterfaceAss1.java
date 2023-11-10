package com.madhan.coreday6;

interface Playable
{
	void play();
}

class Football implements Playable
{
	public void play()
	{
		System.out.println("I am Football player");
	}
}

class Volleyball implements Playable
{
	public void play()
	{
		System.out.println("I am Volleyball player");
	}
}

class Basketball implements Playable
{
	public void play()
	{
		System.out.println("I am Basketball player");
	}
}

public class InterfaceAss1 {

	public static void main(String[] args) {
		Playable pl=new Basketball();
		pl.play();
		Playable vl=new Volleyball();
		vl.play();
		Playable fl=new Football();
		fl.play();

	}

}
