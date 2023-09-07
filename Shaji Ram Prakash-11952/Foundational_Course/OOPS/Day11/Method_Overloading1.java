package com.shaji.Day11;

//Method Overloading
class voiceCall {
	void info() {
		System.out.println(" I'll Suport Voice Call");
	}
}

class conferenceCall{
	void info() {
		System.out.println("I'll Support Conference Call");
	}
}

class videoCall{
	void info() {
		System.out.println("I'll Suport Video call");
	}
}

class mobile{
	public void call(voiceCall voice) {
		voice.info();
	}
	public void call(conferenceCall voice) {
		voice.info();
	}
	public void call(videoCall voice) {
		voice.info();
	}
}
public class Method_Overloading1 {

	public static void main(String[] args) {
		voiceCall voice = new voiceCall();
		
		conferenceCall conference = new conferenceCall();
		
		videoCall video = new videoCall();
		
		mobile vers1 = new mobile();
		vers1.call(voice);
		
		mobile vers2 = new mobile();
		vers2.call(voice);
		vers2.call(conference);
		
		mobile vers3 = new mobile();
		vers3.call(voice);
		vers3.call(conference);
		vers3.call(video);
		

	}

}
