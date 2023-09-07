package com.domnic.oopsday4;

//method overloading
class Voicecall {
	void info() {
		System.out.println("I Will Support Voice Call");
	}
}

class ConferenceCall {
	void info() {
		System.out.println("I Will Support Conference Call ");
	}
}

class Videocall {
	void info() {
		System.out.println("I Will Support Video Call");
	}
}

class Mobile {
	public void call(Voicecall voice) {
		voice.info();
	}

	public void call(ConferenceCall conference) {
		conference.info();
	}

	public void call(Videocall video) {
		video.info();
	}
}

public class MethodOverloading2 {

	public static void main(String[] args) {
		Voicecall voice = new Voicecall();

		ConferenceCall conference = new ConferenceCall();

		Videocall video = new Videocall();
		System.out.println("Version-1");
		Mobile version1 = new Mobile();
		version1.call(voice);
        System.out.println("Version-2");
		Mobile version2 = new Mobile();
		version2.call(voice);
		version2.call(conference);
		System.out.println("Version-3");
		Mobile version3 = new Mobile();
		version3.call(voice);
		version3.call(conference);
		version3.call(video);

	}

}
