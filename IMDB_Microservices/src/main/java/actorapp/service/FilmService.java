package actorapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import actorapp.repository.Actor;
import actorapp.repository.ActorRepository;
import actorapp.repository.Film;
import actorapp.repository.FilmRepository;

@Repository
public class FilmService {

	@Autowired FilmRepository repository;
	
	public List<Film> getFilms(String aName) {
        return (List<Film>) repository.findByName(aName);
    }

	

}
