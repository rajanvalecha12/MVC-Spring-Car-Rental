package com.training.cntrls;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.CarRental;

@Controller
public class TravelRequestController {

	@RequestMapping("/")
	public String initApp() {
		return "index";
	}

	@Autowired
	CarRental trvReq;
	
	@Autowired
	ModelAndView mdlView;

	@ModelAttribute("carTypes")
	public String[] getCarType() {
		return new String[] { "Sedan NAC", "Sedan AC", "HatchBack AC", "Luxury Car" };
	}

	@RequestMapping(name = "/AddRequest", method = RequestMethod.GET)
	public ModelAndView initCarRental() {
		mdlView.setViewName("CarRequest");
		mdlView.addObject("command", trvReq);
		return mdlView;
	}

	@RequestMapping(name = "/AddRequest", method = RequestMethod.POST)
	public String onSubmit(@Valid @ModelAttribute("command") CarRental trvReq,BindingResult result) {
		String nextStep="Welcome";
		if(result.hasErrors())
		{
			nextStep="CarRequest";
		}
		return nextStep;
		
	}
	@RequestMapping("cust/check")
	public String checkStatus(@RequestParam("name") String name, Model mdl)
	{
		mdl.addAttribute("previousBooking","your previous booking was on march 10");
		return "Welcome";
	}
}
