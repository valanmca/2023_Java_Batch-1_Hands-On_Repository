package com.rts;

import com.rts.pojo.Car;
public class App 
{
    public static void main( String[] args )
    {
    	Car car=new Car();
    	car.setCarNo("TN1456S67");
    	car.setManufacturer("Maruti");
    	car.setModel("Baleno");
    	
    	
    	System.out.println(car.getCarNo());
    	System.out.println(car.getManufacturer());
    	System.out.println(car.getModel());
    	
    }
}
