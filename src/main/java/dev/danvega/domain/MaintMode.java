package dev.danvega.domain; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty; 
@Entity
public class MaintMode{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@JsonProperty("inMaintMode") 
    public boolean getInMaintMode() { 
		 return this.inMaintMode; } 
    public void setInMaintMode(boolean inMaintMode) { 
		 this.inMaintMode = inMaintMode; } 
    boolean inMaintMode;
}
