package dev.danvega.domain; 
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty; 
@Entity
public class User implements Serializable{
    @JsonProperty("id") 
    public int getId() { 
		 return this.id; } 
    public void setId(int id) { 
		 this.id = id; } 
    @Id
    int id;
    @JsonProperty("version") 
    public String getVersion() { 
		 return this.version; } 
    public void setVersion(String version) { 
		 this.version = version; } 
    String version;
    @JsonProperty("arraySerialNumber") 
    public String getArraySerialNumber() { 
		 return this.arraySerialNumber; } 
    public void setArraySerialNumber(String arraySerialNumber) { 
		 this.arraySerialNumber = arraySerialNumber; } 
    String arraySerialNumber;
    @JsonProperty("members") 
    public Members getMembers() { 
		 return this.members; } 
    public void setMembers(Members members) { 
		 this.members = members; } 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "members_id",referencedColumnName = "id")    
    Members members;
}
