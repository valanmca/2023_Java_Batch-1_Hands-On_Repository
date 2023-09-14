package oops11;

//Method overloading
class VoiceCall {
	void info() {
		System.out.println("i will support Voice Call");
	}
}
class ConferenceCall{
	void info() {
		System.out.println("I will support Conference Call");
	}
}
class VideoCall{
	void info() {
		System.out.println("I will support Video Call ");
	}
}
class Mobile{
	public void call(VoiceCall voice) {
		voice.info();
	}
	public void call(ConferenceCall conference) {
		conference.info();
	}
	public void call(VideoCall video)
{
		video.info();}
}

public class poly2 {

	public static void main(String[] args) {
		VoiceCall voice=new VoiceCall();
		ConferenceCall conference=new ConferenceCall();
		VideoCall video=new VideoCall();
		
		Mobile vers1=new Mobile();
		vers1.call(voice);
		
		Mobile vers2=new Mobile();
		vers2.call(voice);
		vers2.call(conference);
		
		Mobile vers3=new Mobile();
		vers3.call(voice);
		vers3.call(conference);
		vers3.call(video);
			
	}

}
