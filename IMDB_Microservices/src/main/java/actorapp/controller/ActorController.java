package actorapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import actorapp.model.NameString;
import actorapp.repository.Actor;
import actorapp.service.ActorService;
import actorapp.service.FilmService;



@Controller
public class ActorController {
	 @Autowired
	    private ActorService actorService;
	 
	
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
	    public String getActorByNameSubmit(Model model, @ModelAttribute NameString aNameString) {
	        System.out.println("Submitting:" + aNameString.getContent());
	        //actorService.findActorByName(aNameString);
	        //model.addAttribute("name", aNameString);
	        List <Actor> actors = actorService.getActors(aNameString.getContent());
	        model.addAttribute("actorlist", actors);
	        model.addAttribute("namestring", aNameString);
	        return "actorlist";
	    }

}
