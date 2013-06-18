package models;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;

@Entity
public class Organization {

	@Id
	@Min(10)
	public Long id;
	
	@Required
	public String name;
	
	@ManyToMany
	public List<User> organizationUsers;
	
	@Version
	public Timestamp createdOn;
	
	
}
