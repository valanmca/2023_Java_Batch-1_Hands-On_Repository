package com.purushoth.day11;

class VoiceCall {
	void info() {
		System.out.println("I will support Voice Call");
	}
}

class ConferenceCall {
	void info() {
		System.out.println("I will support Conference Call");
	}
}

class VideoCall {
	void info() {
		System.out.println("I will support Video Call");
	}
}

class Mobile {
	public void call(VoiceCall voice) {
		voice.info();
	}
	
	public void call(ConferenceCall conference) {
		conference.info();
	}
	
	public void call(VideoCall video) {
		video.info();
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		VoiceCall voice=new VoiceCall();
		ConferenceCall conference=new ConferenceCall();
		VideoCall video=new VideoCall();
		
		Mobile ver1=new Mobile();
		ver1.call(voice);
		
		Mobile ver2=new Mobile();
		ver2.call(voice);
		ver2.call(conference);
		
		
		Mobile ver3=new Mobile();
		ver3.call(voice);
		ver3.call(conference);
		ver3.call(video);
	
		
		

	}

}//Method overloading dependency injection. Updating using same value.
