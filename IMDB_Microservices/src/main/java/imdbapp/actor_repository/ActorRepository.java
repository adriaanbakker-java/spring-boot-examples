package imdbapp.actor_repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
	 @Query(value = "select nconst, "+
                    "      birth_year, "+
			        "      known_for_titles, " +
			        "      primary_name, "+
			        "      primary_profession from actor" +
			        "      where primary_name = ?1 " +
			        "      and birth_year is not null", 
			        nativeQuery = true)
	List<Actor> findByName(String aPrimaryName);
}
