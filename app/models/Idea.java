package models;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import play.data.validation.Constraints.MaxLength;
import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class Idea extends Model {

	@Id
	@Min(10)
	public Long id;
	
	@Required
	public String summary;
	
	public String inspiration;
	
	@MaxLength(1000)
	public String description;
	
	@Version
	public Timestamp createdOn;
	
	public static Finder<Long, Idea> find = new Finder<Long, Idea>(Long.class, Idea.class);
	
	public static List<Idea> all() {
		return find.all();
	}
}
