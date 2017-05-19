package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class PostageMain {
	
	public static void main(String[] args) {
		
		List<DeliveryDriver> drivers = new ArrayList<>();
		drivers.add(new PostalServiceFirstClass());
		drivers.add(new PostalServiceSecondClass());
		drivers.add(new PostalServiceThirdClass());
		drivers.add(new SPUTwoDay());
		drivers.add(new SPUNextDay());
		drivers.add(new SPUFourDay());
		drivers.add(new FexEd());  
		System.out.println("Delivery Method \t\t" + "$ cost");
		System.out.println("--------------------------------------");
		for(DeliveryDriver driver: drivers) {
			System.out.println(driver.getClass().getSimpleName() + " \t\t\t" + driver.calculateRate(100, 32));
		}
		
				
	}
}


