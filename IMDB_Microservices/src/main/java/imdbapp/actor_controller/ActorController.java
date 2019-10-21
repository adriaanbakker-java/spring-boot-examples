package imdbapp.actor_controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import imdbapp.actor_repository.Actor;
import imdbapp.actor_service.ActorService;
import imdbapp.film_service.FilmService;
import imdbapp.model.NameString;



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
