package com.madhan.coreday1;
import java.time.LocalTime;

class airplane1
{
    String flightno;
	String destination;
    LocalTime departure;
    int delaytime;	
    
    airplane1(String flightno,String destination,LocalTime departure)
    {
    	this.flightno=flightno;
    	this.destination=destination;
    	this.departure=departure;
    	this.delaytime=0;
    }

	public String getFlightno() {
		return flightno;
	}

	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalTime getDeparture() {
		return departure;
	}

	public void setDeparture(LocalTime departure) {
		this.departure = departure;
	}

	public int getDelaytime() {
		return delaytime;
	}

	public void delay(int min)
	{
		this.delaytime=min;
//		this.departure=this.departure.plusMinutes(min);
	}
	
	public void checkStatus()
	{
		if(delaytime==0)
		{
			System.out.println("Flight " + flightno + " is on time.");
		}
		else
		{
			System.out.println("Flight " + flightno + " is delayed by:" + delaytime + " minutes");
		}
	}
    
    
}


public class Airplane {

	public static void main(String[] args) {
		airplane1 flight1=new airplane1("BEW13","Bangladesh", LocalTime.of(10, 30));
		airplane1 flight2=new airplane1("MAY20","Malaysia", LocalTime.of(1, 3));
		System.out.println("Flight Status :");
		flight1.checkStatus();
		flight2.checkStatus();
		System.out.println("Flight delayed status :");
		flight1.delay(30);
		flight1.checkStatus();

	}

}
