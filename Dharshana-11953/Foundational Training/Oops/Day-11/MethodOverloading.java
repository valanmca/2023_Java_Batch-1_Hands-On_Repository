package com.dharshu.day11;

class VoiceCall{
	void info() {
		System.out.println("\nI will support Voice call");
	}
}

class ConferenceCall{
	void info() {
		System.out.println("I will support Conference call");
	}
}

class VideoCall{
	void info() {
		System.out.println("I will support Video call");
	}
}

class Mobile{
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
		
		Mobile vers1=new Mobile();
		vers1.call(voice);
		
		Mobile vers2=new Mobile();
		vers1.call(voice);
		vers2.call(conference);
		
		Mobile vers3=new Mobile();
		vers1.call(voice);
		vers2.call(conference);
		vers3.call(video);

	}

}
