package dev.danvega.domain; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty; 
@Entity
public class RdaHealth{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@JsonProperty("fileTransferQueueLength") 
    public int getFileTransferQueueLength() { 
		 return this.fileTransferQueueLength; } 
    public void setFileTransferQueueLength(int fileTransferQueueLength) { 
		 this.fileTransferQueueLength = fileTransferQueueLength; } 
    int fileTransferQueueLength;
    @JsonProperty("midwayServerURL") 
    public String getMidwayServerURL() { 
		 return this.midwayServerURL; } 
    public void setMidwayServerURL(String midwayServerURL) { 
		 this.midwayServerURL = midwayServerURL; } 
    String midwayServerURL;
    @JsonProperty("remoteAccessMode") 
    public String getRemoteAccessMode() { 
		 return this.remoteAccessMode; } 
    public void setRemoteAccessMode(String remoteAccessMode) { 
		 this.remoteAccessMode = remoteAccessMode; } 
    String remoteAccessMode;
    @JsonProperty("status") 
    public String getStatus() { 
		 return this.status; } 
    public void setStatus(String status) { 
		 this.status = status; } 
    String status;
}
