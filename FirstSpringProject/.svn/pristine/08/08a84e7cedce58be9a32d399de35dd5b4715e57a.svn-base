package com.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class RestaurantDISetter implements InitializingBean, DisposableBean {
	
	iHotDrink iHotDrinkInt;

	public void setiHotDrinkInt(iHotDrink iHotDrinkInt) {
		this.iHotDrinkInt = iHotDrinkInt;
	}
	public void prepareHotDrink()
	{
		iHotDrinkInt.prepareHotDrink();
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("RestaurantDISetter bean is getting destroyed now...");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("RestaurantDISetter bean is going through after properties set");
			
	}
	

}
