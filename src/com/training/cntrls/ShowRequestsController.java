package com.training.cntrls;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.CarRental;

@Controller
public class ShowRequestsController {
	
	ModelAndView mdlView= new ModelAndView();

	@RequestMapping("/showAll")
	public String getAllRequests(Model model) {
		List<CarRental> reqData = new ArrayList<CarRental>();
		reqData.add(new CarRental("Ramesh", 9988424767L, "ram@abc.com", "Innova"));
		reqData.add(new CarRental("Suresh", 9788424767L, "raj@abc.com", "Scorpio"));
		reqData.add(new CarRental("Mahesh", 9986424767L, "rahul@abc.com", "Maruti"));
		model.addAttribute("reqList", reqData);
		return "ShowAllRequests";
	}

	@RequestMapping(value = "/findRequest/{custName}", method = RequestMethod.GET)
	public String viewCustomerAddress(@PathVariable("custName") String custName, Model model) throws RuntimeException {
		String msg = "15 bookings of " + custName;
		if (custName.equals("Ramesh")) {
			msg = "20 bookkings " + custName;
		}
		model.addAttribute("data", msg);
		if (custName.equals("Mahesh")) {
			throw new RuntimeException();
		}
		return "Display";
	}

	@ExceptionHandler(RuntimeException.class)
	public ModelAndView handleException(HttpServletRequest req,RuntimeException ex) {
		mdlView.addObject("msg", "Runtime Exception handler Called");
		mdlView.addObject("url", req.getRequestURL());
		mdlView.addObject("exception", ex);
		mdlView.setViewName("RunTimeHandler");
		return mdlView;
	}
}
