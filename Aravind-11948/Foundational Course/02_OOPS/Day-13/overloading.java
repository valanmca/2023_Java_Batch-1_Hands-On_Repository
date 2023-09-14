package com.aravind.day13;
class voicecall
{
	void info()
	{
		System.out.println("voice call added");
	}
	
}
class mobile
{
	void call(voicecall voice )
	{
		voice.info();
		
	}
}

public class overloading {

	public static void main(String[] args) {
		voicecall voice=new voicecall();
		mobile obj=new mobile();
		obj.call(voice) ;
		

	}

}
