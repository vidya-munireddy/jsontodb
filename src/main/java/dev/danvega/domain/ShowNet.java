package dev.danvega.domain; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty; 
@Entity
public class ShowNet{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@JsonProperty("dns") 
    public String getDns() { 
		 return this.dns; } 
    public void setDns(String dns) { 
		 this.dns = dns; } 
    String dns;
    @JsonProperty("gateway") 
    public String getGateway() { 
		 return this.gateway; } 
    public void setGateway(String gateway) { 
		 this.gateway = gateway; } 
    String gateway;
    @JsonProperty("ipV4Address") 
    public String getIpV4Address() { 
		 return this.ipV4Address; } 
    public void setIpV4Address(String ipV4Address) { 
		 this.ipV4Address = ipV4Address; } 
    String ipV4Address;
    @JsonProperty("ipV6Address") 
    public String getIpV6Address() { 
		 return this.ipV6Address; } 
    public void setIpV6Address(String ipV6Address) { 
		 this.ipV6Address = ipV6Address; } 
    String ipV6Address;
    @JsonProperty("ipV6Gateway") 
    public String getIpV6Gateway() { 
		 return this.ipV6Gateway; } 
    public void setIpV6Gateway(String ipV6Gateway) { 
		 this.ipV6Gateway = ipV6Gateway; } 
    String ipV6Gateway;
    @JsonProperty("netMask") 
    public String getNetMask() { 
		 return this.netMask; } 
    public void setNetMask(String netMask) { 
		 this.netMask = netMask; } 
    String netMask;
    @JsonProperty("prefixLength") 
    public String getPrefixLength() { 
		 return this.prefixLength; } 
    public void setPrefixLength(String prefixLength) { 
		 this.prefixLength = prefixLength; } 
    String prefixLength;
    @JsonProperty("proxyServer") 
    public String getProxyServer() { 
		 return this.proxyServer; } 
    public void setProxyServer(String proxyServer) { 
		 this.proxyServer = proxyServer; } 
    String proxyServer;
    @JsonProperty("proxyPort") 
    public int getProxyPort() { 
		 return this.proxyPort; } 
    public void setProxyPort(int proxyPort) { 
		 this.proxyPort = proxyPort; } 
    int proxyPort;
    @JsonProperty("proxyProtocol") 
    public String getProxyProtocol() { 
		 return this.proxyProtocol; } 
    public void setProxyProtocol(String proxyProtocol) { 
		 this.proxyProtocol = proxyProtocol; } 
    String proxyProtocol;
}
