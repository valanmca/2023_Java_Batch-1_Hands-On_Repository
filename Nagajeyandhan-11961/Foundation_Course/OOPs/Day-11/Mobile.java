//Method Overloading (Dependency Injection)

package com.jeyandhan.day11;

class VoiceCall {
	public void info() {
		System.out.println("I have Voice Call function");
	}
}

class ConferenceCall {
	public void info() {
		System.out.println("I have Conference Call function");
	}
}

class VideoCall {
	public void info() {
		System.out.println("I have Video Call function");
	}
}

class Phone {
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

public class Mobile {

	public static void main(String[] args) {
		// Object creation
		VoiceCall voice = new VoiceCall();
		Phone verse1 = new Phone();
		verse1.call(voice);

		ConferenceCall conference = new ConferenceCall();
		Phone verse2 = new Phone();
		verse2.call(voice);
		verse2.call(conference);

		VideoCall video = new VideoCall();
		Phone verse3 = new Phone();
		verse3.call(voice);
		verse3.call(conference);
		verse3.call(video);
	}

}
