package com.shiva.day11;

//Real time application

class VoiceCall
{
	void info()
	{
		System.out.println("I will support Voice Call");
	}
}

class ConferenceCall
{
	void info()
	{
		System.out.println("I will support Conference Call");
	}
}

class VideoCall
{
	void info()
	{
		System.out.println("I will support Video Call");
	}
}

class Mobile
{
	public void call(VoiceCall voice)
	{
		voice.info();
	}
	
	public void call(ConferenceCall conference)
	{
		conference.info();
	}
	
	public void call(VideoCall video)
	{
		video.info();
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		VoiceCall voice1=new VoiceCall();//we can use any object name
		
		ConferenceCall conference1=new ConferenceCall();
		
		VideoCall video1=new VideoCall();
		
		Mobile version1=new Mobile();
		version1.call(voice1);
		
		Mobile version2=new Mobile();
		version2.call(voice1);
		version2.call(conference1);
		
		Mobile version3=new Mobile();
		version3.call(voice1);
		version3.call(conference1);
		version3.call(video1);
	}

}
