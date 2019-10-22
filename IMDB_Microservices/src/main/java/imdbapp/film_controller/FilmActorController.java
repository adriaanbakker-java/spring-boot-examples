package imdbapp.film_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import imdbapp.actor_repository.Actor;
import imdbapp.actor_service.ActorService;
import imdbapp.film_repository.Film;
import imdbapp.film_repository.FilmActor;
import imdbapp.film_service.FilmActorService;
import imdbapp.film_service.FilmService;
import imdbapp.model.NameString;

@Controller
public class FilmActorController {
	 @Autowired
	    private FilmActorService filmActorService;
	 
	 @Autowired
	    private ActorService actorService;
	
	 @GetMapping("/filmsbyactor")
	    public String getActorByName(Model model) {
	        model.addAttribute("name", new NameString("actor key here"));
	        return "filmsbyactor";
	    }


	    @PostMapping("/filmsbyactor")
	    public String getFilmByNameSubmit(Model model, @ModelAttribute NameString aNameString) {
	    	String aActorkey = aNameString.getContent();
	        System.out.println("Find filmactor records by actorkey:" + aActorkey);
	        List <FilmActor> filmactors = filmActorService.getFilmActorsByActorKey(aActorkey);
	        
	        Actor actor = actorService.getActorByKey(aActorkey);
	        
	        
	        model.addAttribute("actor", actor);
	        model.addAttribute("filmactors", filmactors);
	        model.addAttribute("namestring", aNameString);
	        return "filmsbyactorlist";
	    }
	 
}
