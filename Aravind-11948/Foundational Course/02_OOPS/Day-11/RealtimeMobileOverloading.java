package com.aravind.day11;
class VoiceCall
{
	void info()
	{
		System.out.println("I will support call");
	}
	
}

class ConferenceCall
{
	void info()
	{
		System.out.println("I will support Conference call");
		
	}
}
class VideoCall
{
	void info()
	{
		System.out.println("I will support video call");
		
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

public class RealtimeMobileOverloading {

	public static void main(String[] args) {
        VoiceCall voice=new VoiceCall();
        ConferenceCall conference=new ConferenceCall();
        VideoCall video=new VideoCall();
       
        // above are object creation for class 
        System.out.println("version1 mobile=");
        Mobile ver1=new Mobile();
        ver1.call(voice);
        
        System.out.println("version2 mobile=");
        Mobile ver2=new Mobile();
        ver2.call(voice);
        ver2.call(conference);
        
        System.out.println("version3 mobile=");
        Mobile ver3=new Mobile();
        ver3.call(voice);
        ver3.call(conference);
        ver3.call(video);
		

	}

}
