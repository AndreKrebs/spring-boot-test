package br.eti.krebscode.springboottest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.eti.krebscode.springboottest.entity.Invited;
import br.eti.krebscode.springboottest.repository.InvitedRepository;

@Controller
public class InvitedController {

	@Autowired
	private InvitedRepository invitedRepository;
	
	@RequestMapping("/")
	public String init() {
		return "index";
	}
	
	@RequestMapping("invitedlist")
	public String invitedList(Model model) {
		
		Iterable<Invited> invited =	invitedRepository.findAll();
		model.addAttribute("inviteds", invited);
		
		return "invitedlist";
	}
	
}
