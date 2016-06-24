package com.adaming.entities;

public class Produit {
	private Long idProduit;
	private String codeProduit;
	private double prix;
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}
