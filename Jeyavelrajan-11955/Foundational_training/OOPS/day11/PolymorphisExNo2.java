package com.jeyavel.OOPS.day11;
//Method Overloading
class call {
	void info() {
		System.out.println("I Am able to call");
	}
}

class ConferenceCall {
	void info() {
		System.out.println("I am able to use conference call ");
	}

}          

class videoCall {
	void info() {
		System.out.println("I am Able to use Video Call");
	}
}

class Mobile {
	public void call(call voice) {
		voice.info();
	}

	public void ConferenceCall(ConferenceCall conference) {
		conference.info();

	}

	public void videoCall(videoCall video) {
		video.info();
	}

}

public class PolymorphisExNo2 {

	public static void main(String[] args) {

		call voice = new call();

		ConferenceCall Conferenc = new ConferenceCall();

		videoCall video = new videoCall();

		Mobile vers1 = new Mobile();
		System.out.println("\nVersion 1");
		vers1.call(voice);

		System.out.println("\nVersion 2");
		Mobile ver2 = new Mobile();
		ver2.call(voice);
		ver2.ConferenceCall(Conferenc);

		System.out.println("\nVersion 3");
		Mobile ver3 = new Mobile();
		ver3.call(voice);
		ver3.ConferenceCall(Conferenc);
		ver3.videoCall(video);

	}

}
