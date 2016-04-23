package com.springseries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentAdmissionController1 {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
	}

	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("AdmissionForm");
		//model.addObject("headerMessage", "GITAM college of enineering" );
		return model;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model)
	{
		model.addAttribute("headerMessage", "GITAM college of enineering" );
	}
	
//	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	// public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar) {

		//String name = reqPar.get("studentName");
		//String hobby = reqPar.get("studentHobby");

	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm( @Valid @ModelAttribute("student1") Student student1, BindingResult result) {
	//	Student student1 = new Student();
		//student1.setStudentName(name);
		//student1.setStudentHobby(hobby);
		 if (result.hasErrors()) {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model; 
		 }
		//model.addObject("msg","Details submitted by you:: Name: "+name+ ", Hobby: " + hobby);
		//model.addObject("headerMessage", "GITAM college of enineering" );
		//model.addObject("student1", student1);
		 ModelAndView model = new ModelAndView("AdmissionSuccess");
		 return model; 
	}
}
