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
import actorapp.repository.Film;
import actorapp.service.ActorService;
import actorapp.service.FilmService;

@Controller
public class filmController {
	 @Autowired
	    private FilmService filmService;
	 
	
	
	
	 @GetMapping("/film")
	    public String getActorByName(Model model) {
	        model.addAttribute("name", new NameString("film name here"));
	        return "film";
	    }


	    @PostMapping("/film")
	    public String getFilmByNameSubmit(Model model, @ModelAttribute NameString aNameString) {
	        System.out.println("Submitting:" + aNameString.getContent());
	        //actorService.findActorByName(aNameString);
	        //model.addAttribute("name", aNameString);
	        List <Film> films = filmService.getFilms(aNameString.getContent());
	        model.addAttribute("filmlist", films);
	        model.addAttribute("namestring", aNameString);
	        return "filmlist";
	    }


}

