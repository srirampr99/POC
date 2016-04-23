package com.springseries;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractController;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greet")	
public class HelloControllerAnnot {

	@RequestMapping("/welcome/{countryName}/{userName}")	
	public ModelAndView helloWorld(@PathVariable("userName")String name, @PathVariable("countryName")String country)
	{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "Hello "+ name + " You are from " + country);
		
		return modelandview;
	}
	
	@RequestMapping("/hi/{countryName}/{userName}")	
	public ModelAndView hiWorld(@PathVariable Map<String,String> pathVars) {
		
		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");
		
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "Hello "+ name + " You are from " + country);
		
		return modelandview;
	}
}
