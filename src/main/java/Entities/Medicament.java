package Entities;

public class Medicament {
	private int id;
	private String nom;
	private double quantity;
	private double prix;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Medicament(int id, String nom, double quantity, double prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.quantity = quantity;
		this.prix = prix;
	}

}
