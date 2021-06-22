package com.app.model; /*pojo(plain old java object) used for increasing readability & re-usability of a
                                 program*/

public class App {    //1 model

	private String ApplicationID;	
	private String Nameofentrepreneur;
	private String ipname;
	private String Zone;
	private String StatusofAllotment;
	
	public String getApplicationID() {
		return ApplicationID;
	}
	public void setApplicationId(String ApplicationID) {
		this.ApplicationID = ApplicationID;
	}
	public String getNameofentrepreneur() {
		return Nameofentrepreneur;
	}
	public void setNameofentrepreneur(String Nameofentrepreneur) {
		this.Nameofentrepreneur = Nameofentrepreneur;
	}
	public String getipname() {
		return ipname;
	}
	public void setipname(String ipname) {
		this.ipname = ipname;
	}
	public String getZone() {
		return Zone;
	}
	public void setZone(String zone) {
		this.Zone = zone;
	}
	public String getStatusofallotment() {
		return StatusofAllotment;
	}
	public void setStatusofAllotment(String statusofallotment) {
		this.StatusofAllotment = statusofallotment;
	}
	   
}