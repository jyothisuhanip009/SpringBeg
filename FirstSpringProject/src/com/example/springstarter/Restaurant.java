package com.example.springstarter;

public class Restaurant {
	
	String welcomeNote;
	IHotDrink hotDrink;
	
	public IHotDrink getHotDrink() {
		return hotDrink;
	}

	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public void prepareHotDrink() {
		hotDrink.prepareHotDrink();
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {

		System.out.println(welcomeNote);
	}
}