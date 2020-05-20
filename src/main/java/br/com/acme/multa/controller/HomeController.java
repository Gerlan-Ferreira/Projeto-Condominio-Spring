package br.com.acme.multa.controller;

import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class HomeController {
	
	
	@GetMapping("/home")
	public ModelAndView home2(){
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	@PostMapping("/home")
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("home");
		
		return mv;
	}

}

