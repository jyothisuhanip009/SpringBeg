package com.example.springmvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class HelloController {

	@RequestMapping("/hello/country/{username}")
	public ModelAndView helloWorld(@PathVariable("username") String user) {

		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hello "+user);

		return model;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld() {

		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hi world");

		return model;
	}

}