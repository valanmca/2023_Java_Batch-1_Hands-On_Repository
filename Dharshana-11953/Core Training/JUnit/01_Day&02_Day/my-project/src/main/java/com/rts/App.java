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
       Car car=new Car();
       car.setCarNo("TN1451422");
       car.setManufacture("Maruti");
       car.setModel("Baleno");
       
       System.out.println(car.getCarNo());
       System.out.println(car.getManufacture());
       System.out.println(car.getModel());
    }
}
