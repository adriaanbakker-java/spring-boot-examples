package actorapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
	 @Query(value = "select tconst, title_type, primary_title, original_title, is_adult, start_year, "+
                    " end_year, runtime_minutes, genres" +
			        " from film where primary_title = ?1", 
			        nativeQuery = true)
	List<Film> findByName(String aPrimaryTitle);
}
