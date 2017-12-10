package br.eti.krebscode.springboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvitedController {

	@RequestMapping("/")
	public String init() {
		return "index";
	}
	
}
