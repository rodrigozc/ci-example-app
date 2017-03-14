package br.com.kroton.example.ci.models;

public class Version {
	
	private int major;
	private int minor;
	private int maintenance;
	private int build;
	
	public int getMajor() {
		return major;
	}
	
	public void setMajor(int major) {
		this.major = major;
	}
	
	public int getMinor() {
		return minor;
	}
	
	public void setMinor(int minor) {
		this.minor = minor;
	}
	
	public int getMaintenance() {
		return maintenance;
	}
	
	public void setMaintenance(int maintenance) {
		this.maintenance = maintenance;
	}
	
	public int getBuild() {
		return build;
	}
	
	public void setBuild(int build) {
		this.build = build;
	}

}
