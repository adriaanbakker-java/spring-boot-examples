package imdbapp.film_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import imdbapp.actor_repository.Actor;
import imdbapp.actor_repository.ActorRepository;
import imdbapp.film_repository.FilmActor;
import imdbapp.film_repository.FilmActorRepository;


@Repository
public class FilmActorService {
	
	 @Autowired FilmActorRepository repository;
	 
	public List<FilmActor> getFilmActorsByFilmKey(String aFilmkey) {
        return (List<FilmActor>) repository.findByTconst(aFilmkey);
    }
	public List<FilmActor> getFilmActorsByActorKey(String aActorkey) {
        return (List<FilmActor>) repository.findByNconst(aActorkey);
    }
	
}

