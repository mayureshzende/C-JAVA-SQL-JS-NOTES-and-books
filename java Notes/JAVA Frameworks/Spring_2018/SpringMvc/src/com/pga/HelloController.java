package com.pga;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//http://localhost:8080/SpringMvc/example/hello
// Request Handler
@Controller
public class HelloController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String handleHello(Model model) {
		model.addAttribute("MESSAGE", "Welcome to Spring MVC !!!");
		return "sayWelcome";
	}
	
}





