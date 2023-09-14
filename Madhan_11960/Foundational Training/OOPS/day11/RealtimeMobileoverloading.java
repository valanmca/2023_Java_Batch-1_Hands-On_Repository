package com.madhan.day11;

class VoiceCall
{
	void info()
	{
		System.out.println("I am voice call");
	}
}

class VideoCall
{
	void info()
	{
		System.out.println("I am Video call");
	}
}
class Mobile
{
	public void call(VoiceCall voice)
	{
		voice.info();
	}
	
	public void call(VideoCall video)
	{
		video.info();
	}
}

public class RealtimeMobileoverloading {

	public static void main(String[] args) {
		
		VoiceCall voice1=new VoiceCall();
		VideoCall video1=new VideoCall();
		Mobile ver1=new Mobile();
		ver1.call(voice1);
		ver1.call(video1);
		

	}

}
