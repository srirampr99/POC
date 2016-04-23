package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext; 
public class TestSpringProject {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		
		//RestaurantDIConstructor restaurantObjDI = (RestaurantDIConstructor) context.getBean("restaurantDIConstructorBean");
		//restaurantObjDI.prepareHotDrink();
		
		Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		restaurantObj.greetCustomer();
		
		((AbstractApplicationContext)context).registerShutdownHook();

		//Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		//restaurantObj.displayWaiterNames();

		//RestaurantDISetter restaurantObjDI = (RestaurantDISetter) context.getBean("restaurantDISetterBean");
		//restaurantObjDI.prepareHotDrink();

	}
}