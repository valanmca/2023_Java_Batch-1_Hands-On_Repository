package com.gayathri.day11;//real time concept
class VoiceCall{//HAS - A relationship with Mobile and (voicecall,concall,vc) 
	void info() {
		System.out.println("I will support voice call");
	}
}
class ConferenceCall{
	void info()
	{
		System.out.println("I will support conference call");
	}
}
class VideoCall{
	void info() {
		System.out.println("I will support video call");
	}
}
class Mobile{
	public void call(VoiceCall voice)
	{
		voice.info();
	}
	public void call(ConferenceCall concal) {
		concal.info();
	}
	public void call(VideoCall vc) {
		vc.info();
	}
	
	
}
public class MobileMethodOverloading {

	public static void main(String[] args) {
		
		VoiceCall voice = new VoiceCall();
		ConferenceCall concal = new ConferenceCall();
		VideoCall vc = new VideoCall();
		
		System.out.println("\nIn version 1...............");
		Mobile ver1 = new Mobile();
		ver1.call(voice);
		
		System.out.println("\nIn version 2...............");
		Mobile ver2 = new Mobile();
		ver2.call(voice);
		ver2.call(concal);
		
		System.out.println("\nIn version 3...............");
		Mobile ver3 = new Mobile();
		ver3.call(voice);
		ver2.call(concal);
		ver2.call(vc);

	}

}
