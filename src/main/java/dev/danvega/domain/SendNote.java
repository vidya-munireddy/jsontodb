package dev.danvega.domain; 
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty; 
@Entity
public class SendNote{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@JsonProperty("collectionEnd") 
    public CollectionEnd getCollectionEnd() { 
		 return this.collectionEnd; } 
    public void setCollectionEnd(CollectionEnd collectionEnd) { 
		 this.collectionEnd = collectionEnd; }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "collectionEnd_id",referencedColumnName = "id")
    CollectionEnd collectionEnd;
    @JsonProperty("collectionNotes") 
    public String getCollectionNotes() { 
		 return this.collectionNotes; } 
    public void setCollectionNotes(String collectionNotes) { 
		 this.collectionNotes = collectionNotes; } 
    String collectionNotes;
    @JsonProperty("collectionStart") 
    public CollectionStart getCollectionStart() { 
		 return this.collectionStart; } 
    public void setCollectionStart(CollectionStart collectionStart) { 
		 this.collectionStart = collectionStart; }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "collectionStart_id",referencedColumnName = "id")
    CollectionStart collectionStart;
}
