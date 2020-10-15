package com.arteach.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class indexController {
	
	@RequestMapping("/")
	public String index() {
		
		return "index";		
	}
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
	   public String login() {
	      return "login";
	   }
	 @RequestMapping(value = "/findstuff", method = RequestMethod.GET)
	   public String findstuff() {
	      return "findstuff";
	   }
	 @RequestMapping(value = "/searchDB", method = RequestMethod.GET)
	   public String searchDB() {
	      return "searchDB";
	   }
	 @RequestMapping(value = "/museum", method = RequestMethod.GET)
	   public String museum() {
	      return "museum";
	 }


}
