package Core_Topic_Domnic_Day_6;

class Sports{
	void play(){
		System.out.println("We can play all games");
	}
}
class Football extends Sports{
	void play(){
		System.out.println("We can play football with leg");
	}
}

class Basketball extends Sports{
	void play(){
		System.out.println("We can play Basketball with hand");
	}
}

class Rugby extends Sports{
	void play(){
		System.out.println("We can play Rugby with both");
	}
}
public class Assg_3 {

	public static void main(String[] args) {
    Football obj1=new Football();
    obj1.play();
    
    Basketball obj2=new Basketball();
    obj2.play();
    
    Rugby obj3=new Rugby();
    obj3.play();
    
	}

}
