package com.example.IMDB_Microservices.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.IMDB_Microservices.model.NameString;



@Controller
public class ActorController {

	 @GetMapping("/")
	    public String index(Model model) {
	        return "index";
	    }
	 
	
	 @GetMapping("/actor")
	    public String getActorByName(Model model) {
	        model.addAttribute("name", new NameString("actornaam invullen"));
	        return "actor";
	    }


	    @PostMapping("/actor")
	    public String getActorByNameSubmit(@ModelAttribute NameString aNameString) {
	        System.out.println("Submitting:" + aNameString.getContent());
	        //actorService.findActorByName(aNameString);
	        return "index";
	    }

}
