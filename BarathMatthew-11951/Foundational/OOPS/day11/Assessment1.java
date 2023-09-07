package com.matthew.day11;

//creating class with voice call functionality
class VoiceCall{
	void info() {
		System.out.println("I Will support Voice Call");
	}
}

//creating class with conference call functionality
class Conference{
	void info() {
		System.out.println("I wil support conference call");
	}
}

//creating class with video call functionality
class VideoCall{
	void info() {
		System.out.println("I will Support Video call");
	}
}

//using the created calling class via method overloading
class Mobile{
	
	//just for voice calling
	public void call(VoiceCall voice) {//creating reference
		voice.info();
	}
	
	//for voice and conference call
	public void call(Conference conference) {
		conference.info();
	}
	
	//for voice conference and video call
	public void call(VideoCall video) {
		video.info();
	}
	
	
	
}
public class Assessment1 {

	public static void main(String[] args) {
		// creating object
		VoiceCall voice = new VoiceCall();
		
		Conference conference = new Conference();
		
		VideoCall video = new VideoCall();
		
		//only call
		Mobile gen1 = new Mobile();
		gen1.call(voice);
		
		//call and conference
		
		Mobile gen2 = new Mobile();
		gen2.call(voice);
		gen2.call(conference);
		//call, conference and video
		
		Mobile gen3 = new Mobile();
		gen3.call(voice);
		gen3.call(conference);
		gen3.call(video);

	}

}
