package actorapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import actorapp.repository.Actor;
import actorapp.repository.ActorRepository;


@Repository
public class ActorService {
	
	 @Autowired ActorRepository repository;
	 
	public List<Actor> getActors(String aName) {
        return (List<Actor>) repository.findByName(aName);
    }
}
