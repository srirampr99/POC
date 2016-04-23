package com.springcore;

import java.util.List;



/**
 * Spring bean
 * 
 */
public class Restaurant {
	
	private List restaurantWaiterList;
	
	public String getWelcomeNote() {
		return welcomeNote;
	}


	public void setRestaurantWaiterList(List restaurantWaiterList) {
		this.restaurantWaiterList = restaurantWaiterList;
	}


	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}


	String welcomeNote;
	

	public void greetCustomer() {

		System.out.println(welcomeNote);
	}
	
	public void displayWaiterNames()
	{
		System.out.println("All waiters working in the restaurant : " + restaurantWaiterList );
	}
	
	public void init()
	{
		System.out.println("Restaurant bean is going through init...!");
	}
	
	public void destroy()
	{
		System.out.println("Bean will be destroyed now...!");
	}
	
}