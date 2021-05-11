package com.js.nba;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drmilk.nbawrapper.domain.Player;
import com.drmilk.nbawrapper.exception.PlayerNotFoundException;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {
	
	
	
	@ModelAttribute("cp")
	public String getContexxtPath(HttpServletRequest request) {
		
		return request.getContextPath();
	}
	
	@ModelAttribute("name")
	public String getName() throws PlayerNotFoundException {
		Player player = Player.getPlayerByNameKeywords("westbrook");
	
		return player.getFirstName() + player.getLastName();
		
		
	}
	
		
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
			
		return "home";
	}
}
