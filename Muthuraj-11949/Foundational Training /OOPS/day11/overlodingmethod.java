package com.muthu.day11;
//
class Voicecall{
	void info() {
		System.out.println("I will support voice call");
	}
}
class Conferencecall{
	void info() {
		System.out.println("I will support Conference call");
	}
}
class Vediocall{
	void info() {
		System.out.println("I will support vedio call");
	}
}
//
class Mobile{
public void call(Voicecall Voice) {
		Voice.info();
	}

public void call(Conferencecall Conference) {
	Conference.info();
}
public void call(Vediocall Vedio) {
	Vedio.info();
}
}

//

public class overlodingmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Voicecall voice = new Voicecall();
         
         Conferencecall conference = new Conferencecall();
         
         Vediocall vedio=new Vediocall();
         
         Mobile vers1=new Mobile();
         vers1.call(voice);
         
         Mobile vers2=new Mobile();
         vers2.call(voice);
         vers2.call(conference);
         
         Mobile vers3=new Mobile();
         vers3.call(voice);
         vers3.call(conference);
         vers3.call(vedio);
         
	}

}
