package dev.danvega.domain; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty; 
@Entity
public class CollectionEnd{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@JsonProperty("ms") 
    public String getMs() { 
		 return this.ms; } 
    public void setMs(String ms) { 
		 this.ms = ms; } 
    String ms;
    @JsonProperty("tz") 
    public String getTz() { 
		 return this.tz; } 
    public void setTz(String tz) { 
		 this.tz = tz; } 
    String tz;
}
