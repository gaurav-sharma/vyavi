package models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;

@Entity
public class Activity {
	
	@Id
	@Min(10)
	public Long id;
	
	@Required
	public User who;	
	
	@Required
	public String what;
	
	@Version
	public Timestamp when;
}
