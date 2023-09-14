
package com.jeban.OOPsday4;//MethodOver Loading Problem

class Voicecall{
	void info() {
		System.out.println("I Support Voice Call");
	}
}

class Confrencecall{
	void info() {
		System.out.println("I Support Confrence Call");
	}
}

class Videocall{
	void info() {
		System.out.println("I Support Video Call");
	}
}


class Mobile{
	public void call(Voicecall voice) {
		voice.info();
		
	}
	
	public void call(Confrencecall confrence) {
		confrence.info();
	}
	public void call(Videocall video) {
		video.info();
	}
	
}

public class polymorphism2 {

	public static void main(String[] args) {
		Voicecall voice=new Voicecall();
		
		Confrencecall confrence=new Confrencecall();
		
		Videocall video=new Videocall();
		
		
		
		Mobile v1=new Mobile();
		v1.call(voice);
		
		Mobile v2=new Mobile();
		v1.call(voice);
		v2.call(confrence);
		
//		
//		Mobile v1=new Mobile();
//		Mobile v2=new Mobile();
		Mobile v3=new Mobile();
		v1.call(voice);
		v2.call(confrence);
		v3.call(video);
	
		
		
		

	}

}
