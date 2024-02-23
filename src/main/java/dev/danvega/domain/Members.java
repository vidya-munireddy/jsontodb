package dev.danvega.domain; 
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty; 
@Entity
public class Members implements Serializable{
		@JsonProperty("id") 
    public String getId() { 
		 return this.id; } 
    public void setId(String id) { 
		 this.id = id; } 
    @Id
    String id;
    @JsonProperty("alertFixedCount") 
    public int getAlertFixedCount() { 
		 return this.alertFixedCount; } 
    public void setAlertFixedCount(int alertFixedCount) { 
		 this.alertFixedCount = alertFixedCount; } 
    int alertFixedCount;
    @JsonProperty("alertIgnoreCount") 
    public int getAlertIgnoreCount() { 
		 return this.alertIgnoreCount; } 
    public void setAlertIgnoreCount(int alertIgnoreCount) { 
		 this.alertIgnoreCount = alertIgnoreCount; } 
    int alertIgnoreCount;
    @JsonProperty("alertNewCount") 
    public int getAlertNewCount() { 
		 return this.alertNewCount; } 
    public void setAlertNewCount(int alertNewCount) { 
		 this.alertNewCount = alertNewCount; } 
    int alertNewCount;
    @JsonProperty("arrayDate") 
    public ArrayDate getArrayDate() { 
		 return this.arrayDate; } 
    public void setArrayDate(ArrayDate arrayDate) { 
		 this.arrayDate = arrayDate; } 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "arrayDate_id",referencedColumnName = "id")
    ArrayDate arrayDate;
    @JsonProperty("arrayTZ") 
    public String getArrayTZ() { 
		 return this.arrayTZ; } 
    public void setArrayTZ(String arrayTZ) { 
		 this.arrayTZ = arrayTZ; } 
    String arrayTZ;
    @JsonProperty("buildNumber") 
    public String getBuildNumber() { 
		 return this.buildNumber; } 
    public void setBuildNumber(String buildNumber) { 
		 this.buildNumber = buildNumber; } 
    String buildNumber;
    @JsonProperty("cageCount") 
    public int getCageCount() { 
		 return this.cageCount; } 
    public void setCageCount(int cageCount) { 
		 this.cageCount = cageCount; } 
    int cageCount;
    @JsonProperty("cageIssue") 
    public boolean getCageIssue() { 
		 return this.cageIssue; } 
    public void setCageIssue(boolean cageIssue) { 
		 this.cageIssue = cageIssue; } 
    boolean cageIssue;
	@JsonProperty("domain") 
    public String getDomain() { 
		 return this.domain; } 
    public void setDomain(String domain) { 
		 this.domain = domain; } 
    String domain;
    @JsonProperty("envIssue") 
    public boolean getEnvIssue() { 
		 return this.envIssue; } 
    public void setEnvIssue(boolean envIssue) { 
		 this.envIssue = envIssue; } 
    boolean envIssue;
    @JsonProperty("freeCapacityMiB") 
    public double getFreeCapacityMiB() { 
		 return this.freeCapacityMiB; } 
    public void setFreeCapacityMiB(double freeCapacityMiB) { 
		 this.freeCapacityMiB = freeCapacityMiB; } 
    double freeCapacityMiB;
    @JsonProperty("heartBeatVersion") 
    public String getHeartBeatVersion() { 
		 return this.heartBeatVersion; } 
    public void setHeartBeatVersion(String heartBeatVersion) { 
		 this.heartBeatVersion = heartBeatVersion; } 
    String heartBeatVersion;
    @JsonProperty("lastModifiedEpoch") 
    public int getLastModifiedEpoch() { 
		 return this.lastModifiedEpoch; } 
    public void setLastModifiedEpoch(int lastModifiedEpoch) { 
		 this.lastModifiedEpoch = lastModifiedEpoch; } 
    int lastModifiedEpoch;
    
    @JsonProperty("maintMode") 
    public MaintMode getMaintMode() { 
		 return this.maintMode; } 
    public void setMaintMode(MaintMode maintMode) { 
		 this.maintMode = maintMode; }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "maintMode_id",referencedColumnName = "id")
    MaintMode maintMode;
    @JsonProperty("nodeCount") 
    public int getNodeCount() { 
		 return this.nodeCount; } 
    public void setNodeCount(int nodeCount) { 
		 this.nodeCount = nodeCount; } 
    int nodeCount;
    @JsonProperty("nodeIssue") 
    public boolean getNodeIssue() { 
		 return this.nodeIssue; } 
    public void setNodeIssue(boolean nodeIssue) { 
		 this.nodeIssue = nodeIssue; } 
    boolean nodeIssue;
    @JsonProperty("overTemp") 
    public boolean getOverTemp() { 
		 return this.overTemp; } 
    public void setOverTemp(boolean overTemp) { 
		 this.overTemp = overTemp; } 
    boolean overTemp;
    @JsonProperty("pdCount") 
    public int getPdCount() { 
		 return this.pdCount; } 
    public void setPdCount(int pdCount) { 
		 this.pdCount = pdCount; } 
    int pdCount;
    @JsonProperty("pdIssue") 
    public boolean getPdIssue() { 
		 return this.pdIssue; } 
    public void setPdIssue(boolean pdIssue) { 
		 this.pdIssue = pdIssue; } 
    boolean pdIssue;
    @JsonProperty("psCount") 
    public int getPsCount() { 
		 return this.psCount; } 
    public void setPsCount(int psCount) { 
		 this.psCount = psCount; } 
    int psCount;
    @JsonProperty("psIssue") 
    public boolean getPsIssue() { 
		 return this.psIssue; } 
    public void setPsIssue(boolean psIssue) { 
		 this.psIssue = psIssue; } 
    boolean psIssue;
    @JsonProperty("rdaHealth") 
    public RdaHealth getRdaHealth() { 
		 return this.rdaHealth; } 
    public void setRdaHealth(RdaHealth rdaHealth) { 
		 this.rdaHealth = rdaHealth; } 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rdaHealth_id",referencedColumnName = "id")
    RdaHealth rdaHealth;
    @JsonProperty("sendNote") 
    public SendNote getSendNote() { 
		 return this.sendNote; } 
    public void setSendNote(SendNote sendNote) { 
		 this.sendNote = sendNote; } 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sendNote_id",referencedColumnName = "id")
    SendNote sendNote;
    @JsonProperty("serialNumber") 
    public String getSerialNumber() { 
		 return this.serialNumber; } 
    public void setSerialNumber(String serialNumber) { 
		 this.serialNumber = serialNumber; } 
    String serialNumber;
    @JsonProperty("showNet") 
    public ShowNet getShowNet() { 
		 return this.showNet; } 
    public void setShowNet(ShowNet showNet) { 
		 this.showNet = showNet; }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "showNet_id",referencedColumnName = "id")
    ShowNet showNet;
    @JsonProperty("systemModel") 
    public String getSystemModel() { 
		 return this.systemModel; } 
    public void setSystemModel(String systemModel) { 
		 this.systemModel = systemModel; } 
    String systemModel;
    @JsonProperty("systemWWN") 
    public String getSystemWWN() { 
		 return this.systemWWN; } 
    public void setSystemWWN(String systemWWN) { 
		 this.systemWWN = systemWWN; } 
    String systemWWN;
    @JsonProperty("uid") 
    public String getUid() { 
		 return this.uid; } 
    public void setUid(String uid) { 
		 this.uid = uid; } 
    String uid;
    @JsonProperty("upgradeInProgress") 
    public boolean getUpgradeInProgress() { 
		 return this.upgradeInProgress; } 
    public void setUpgradeInProgress(boolean upgradeInProgress) { 
		 this.upgradeInProgress = upgradeInProgress; } 
    boolean upgradeInProgress;
    @JsonProperty("uri") 
    public String getUri() { 
		 return this.uri; } 
    public void setUri(String uri) { 
		 this.uri = uri; } 
    String uri;
    
}
