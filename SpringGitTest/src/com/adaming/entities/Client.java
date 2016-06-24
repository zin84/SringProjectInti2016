package com.adaming.entities;

import java.util.Date;

public class Client {
	
	 private Long idClient;
	 private Date dateDeNaissance;	// Date
	 private Long x;
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public Long getX() {
		return x;
	}
	public void setX(Long x) {
		this.x = x;
	}

}
