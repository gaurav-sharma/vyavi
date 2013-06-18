package models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;

@Entity
public class User {
	
	@Id
	@Min(10)
	public Long id;
	
	@Required
	public String firstName;
	
	@Required
	public String lastName;
	
	public String userName;
	
	public String password;
	
	@Email
	@Required
	public String email;
	
	@Version
	public Timestamp createdOn;
}
