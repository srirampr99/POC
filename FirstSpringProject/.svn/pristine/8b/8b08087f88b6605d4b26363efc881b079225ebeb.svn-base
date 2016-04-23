package com.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RestaurantDIConstructor {
	
	iHotDrink iHotDrinkInt;
	
	RestaurantDIConstructor(iHotDrink hotDrink)
	{
		this.iHotDrinkInt = hotDrink;
	}
	
	public void prepareHotDrink()
	{
		iHotDrinkInt.prepareHotDrink();
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Restaurant bean is going through init...!");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Bean will be destroyed now...!");
	}
}
