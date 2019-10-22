package imdbapp.film_repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class FilmActor {
	// This is a table that only serves to relate films with actors
	// 
	// It has a the composite key of tconst and nconst
	// we do not need to have any "intelligence" for generating this key.
	
	// JPA/Hibernate requires a key to make this an entity.
	// Therefore, at least a technical key is created to avoid creating composite key construct for
    // hibernate. Composite key construct for hibernate would have been 
	// possible but is also bit involved and misses the point
	// as no update or insert is done on this table.
	// (The way import is done on this table is outside java by import of a tsv file.)
	
	// Note that this workaround also required me to generate a value for tnkey. A sequence and a 
	// pre insert trigger was needed in Postgres to make this work. Took me some time!
	@Id
	private Integer tnkey;
    private String tconst;
    private Integer ordering;
    private String nconst;
    private String category;
    private String job;
    private String characters;
	public Integer getTnkey() {
		return tnkey;
	}
	public void setTnkey(Integer tnkey) {
		this.tnkey = tnkey;
	}
	public String getTconst() {
		return tconst;
	}
	public void setTconst(String tconst) {
		this.tconst = tconst;
	}
	public Integer getOrdering() {
		return ordering;
	}
	public void setOrdering(Integer ordering) {
		this.ordering = ordering;
	}
	public String getNconst() {
		return nconst;
	}
	public void setNconst(String nconst) {
		this.nconst = nconst;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getCharacters() {
		return characters;
	}
	public void setCharacters(String characters) {
		this.characters = characters;
	}
    
}