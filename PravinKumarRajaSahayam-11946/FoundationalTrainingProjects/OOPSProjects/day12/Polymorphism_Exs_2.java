//Using OverLoading Method for Calling the difference sub class in the super class
package com.pravinkumar.day12;

//Method Over Loadings
class VoiceCall {
	void info() {
		System.out.println("I will support Voice Call : ");
	}
}

class ConferenceCall {
	void info() {
		System.out.println("I will support Conference call : ");
	}
}

class VideoCall {
	void info() {
		System.out.println("I will support Video Call : ");
	}
}

//super class using number of the Methods Callings
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

public class Polymorphism_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoiceCall voice = new VoiceCall();

		ConferenceCall conference = new ConferenceCall();

		VideoCall video = new VideoCall();
//Calling the Objects
		Mobile vers1 = new Mobile();
		vers1.call(voice);

		Mobile vers2 = new Mobile();
		vers2.call(voice);
		vers2.call(conference);

		Mobile vers3 = new Mobile();
		vers3.call(voice);
		vers3.call(conference);
		vers3.call(video);

	}

}
