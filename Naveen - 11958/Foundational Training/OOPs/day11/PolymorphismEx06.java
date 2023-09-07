
package com.naveen.day11;

//Constructor Overloading using Real time Scenario.
class VoiceCall1 {
	void info() {
		System.out.println("I will support Voice call");
	}
}

class ConferenceCall1 {
	void info() {
		System.out.println("I will support Conference call");
	}
}

class VideoCall1 {
	void info() {
		System.out.println("I will support Video call");
	}
}

class Mobile1 { // class name obj
	Mobile1(VoiceCall1 voice) { // Here it is a object as a Argument.
		// obj call
		voice.info();
	}

	Mobile1(ConferenceCall1 conference) {
		conference.info();
	}

	Mobile1(VideoCall1 video) {
		video.info();
	}
}

public class PolymorphismEx06 {

	public static void main(String[] args) {
		VoiceCall1 voice = new VoiceCall1();

		ConferenceCall1 conference = new ConferenceCall1();

		VideoCall1 video = new VideoCall1();

		Mobile1 vers1 = new Mobile1(voice);

		Mobile1 vers2 = new Mobile1(conference);

		Mobile1 vers3 = new Mobile1(video);

	}

}
