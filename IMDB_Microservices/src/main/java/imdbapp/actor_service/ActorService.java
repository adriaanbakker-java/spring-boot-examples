package imdbapp.actor_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import imdbapp.actor_repository.Actor;
import imdbapp.actor_repository.ActorRepository;


@Repository
public class ActorService {
	
	 @Autowired ActorRepository repository;
	 
	public List<Actor> getActors(String aName) {
        return (List<Actor>) repository.findByName(aName);
    }

	public Actor getActorByKey(String aActorkey) {
		return (Actor) repository.findByNconst(aActorkey);
	}
}
