package com.naveen.day11;

//Method Overloading using Real time Scenario.
class VoiceCall {
	void info() {
		System.out.println("I will support Voice call");
	}
}

class ConferenceCall {
	void info() {
		System.out.println("I will support Conference call");
	}
}

class VideoCall {
	void info() {
		System.out.println("I will support Video call");
	}
}

class Mobile { // class name obj
	public void call(VoiceCall voice) { // Here it is a object as a Argument.
		// obj call
		voice.info();
	}

	public void call(ConferenceCall conference) {
		conference.info();
	}

	public void call(VideoCall video) {
		video.info();
	}
}

public class PolymorphismEx02 {

	public static void main(String[] args) {
		VoiceCall voice = new VoiceCall();

		ConferenceCall conference = new ConferenceCall();

		VideoCall video = new VideoCall();

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
