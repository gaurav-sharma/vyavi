package models;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class User extends Model {

	@Id
	@Min(10)
	public Long id;

	public String firstName;

	public String lastName;

	public String userName;

	public String password;

	@Email
	@Required
	public String email;

	@Version
	public Timestamp createdOn;

	public static Finder<Long, User> find = new Finder<Long, User>(Long.class, User.class);

	public static List<User> all() {
		return find.all();
	}
}
