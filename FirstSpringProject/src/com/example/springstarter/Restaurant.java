package com.example.springstarter;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant implements InitializingBean, DisposableBean {
	
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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method");
		
	}
}