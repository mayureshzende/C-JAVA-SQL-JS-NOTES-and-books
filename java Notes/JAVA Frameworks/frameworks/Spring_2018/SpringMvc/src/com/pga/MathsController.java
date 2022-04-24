package com.pga;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MathsController {
	//http://localhost:8080/SpringMvc/example/hi
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public ModelAndView handleHi() {
		ModelAndView obj = new ModelAndView();
		obj.setViewName("sayWelcome");
		obj.addObject("MESSAGE", "Hi, Welcome to Spring WORLD");
		return obj;
	}

	//http://localhost:8080/SpringMvc/add/10/20
	@RequestMapping(value = "/add/{num1}/{num2}", method = RequestMethod.GET)
	public ModelAndView add(@PathVariable("num1") int n1,
			@PathVariable("num2") int n2) {
		ModelAndView obj = new ModelAndView();
		int res = n1 + n2;
		obj.addObject("NUM1", n1);
		obj.addObject("NUM2", n2);
		obj.addObject("RESULT", res);
		obj.setViewName("result");
		return obj;
	}
}









