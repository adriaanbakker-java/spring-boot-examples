package imdbapp.film_repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmActorRepository extends JpaRepository<FilmActor, Long> {

	List<FilmActor> findByTconst(String aTConst);

	List<FilmActor> findByNconst(String aActorkey);

	
}
