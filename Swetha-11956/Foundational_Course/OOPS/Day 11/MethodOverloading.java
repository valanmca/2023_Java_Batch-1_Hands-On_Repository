package com.swetha.day11;

//Method Overloading
class VoiceCall{
	void info(){
		System.out.println("I will support voice call");
	}
}
class ConferenceCall{
	void info() {
		System.out.println("I will support conference call");
	}
}
class VideoCall{
	void info() {
		System.out.println("I will support video call");
	}
}


class Mobile{
	public void call(VoiceCall voice) {         //Overloading--same method name ,different arguments(Classname,object)
		voice.info();	
		}
	public void call(ConferenceCall conference) {    //here ,the object is given as an argument.
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

}
