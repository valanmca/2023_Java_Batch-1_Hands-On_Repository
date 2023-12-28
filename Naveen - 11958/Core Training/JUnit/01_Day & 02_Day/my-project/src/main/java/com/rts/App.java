package com.rts;

import com.rts.pojo.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Car car = new Car();
    	car.setCarNo("1234");
    	car.setManufacturer("Maruti");
    	car.setModel("Glanza");
    	
    	System.out.println(car.getCarNo());
    	System.out.println(car.getManufacturer());
    	System.out.println(car.getModel());
    	
    	
    }
}
