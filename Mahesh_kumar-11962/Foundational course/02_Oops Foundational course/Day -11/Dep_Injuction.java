package com.mahesh.Oops_day11;

class Voicecall

{
	void info() {
		System.out.println("It will support voice call.");
	}
}

class Conferencecall {
	void info() {
		System.out.println("It will support conferencecall. ");
	}
}

class Videocall {
	void info() {
		System.out.println("It will support videocall");
	}
}

class VideoConference {
	void info() {
		System.out.println("It will support videoconference call");
	}
}

class mobile {
	public void call(Voicecall voice) {
		voice.info();
	}

	public void call(Conferencecall conf_call) {
		conf_call.info();
	}

	public void call(Videocall video) {
		video.info();
	}

	public void call(VideoConference vid_conf) {
		vid_conf.info();
	}
}

public class Dep_Injuction { //Dependency Injuction
	//mobile versions and calling features
	//polymorphism =>adding extra features with existing one.

	public static void main(String[] args) {

		Voicecall voice = new Voicecall();
		mobile ver_1 = new mobile();
		ver_1.call(voice);

		Conferencecall conf_call = new Conferencecall();
		mobile ver_2 = new mobile();
		ver_2.call(conf_call);

		Videocall video = new Videocall();
		mobile ver_3 = new mobile();
		ver_3.call(video);

		VideoConference vid_conf = new VideoConference();
		mobile ver_4 = new mobile();
		ver_4.call(vid_conf);
	}

}
