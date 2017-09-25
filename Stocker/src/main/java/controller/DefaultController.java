package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	
	@RequestMapping(value="/dashboard",method = RequestMethod.GET)
	public ModelAndView dashboardAction(){
		ModelAndView model = new ModelAndView("/default/dashboard");
		
		return model;
		
	}

}
