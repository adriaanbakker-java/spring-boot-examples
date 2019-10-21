package imdbapp.film_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import imdbapp.actor_repository.Actor;
import imdbapp.actor_repository.ActorRepository;
import imdbapp.film_repository.Film;
import imdbapp.film_repository.FilmRepository;

@Repository
public class FilmService {

	@Autowired FilmRepository repository;
	
	public List<Film> getFilms(String aName) {
        return (List<Film>) repository.findByName(aName);
    }

	

}
