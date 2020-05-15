package com.example.springstarter;

public class Tea implements IHotDrink {
	
	@Override
	public void prepareHotDrink() {
		System.out.println("Tea is prepared");
	}

}
