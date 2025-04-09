package model;

public class Mois {

	private int nom;
	private boolean[] jours;

	public Mois(int nom, int nbJours) {

		this.nom = nom;
		this.jours = new boolean[nbJours];
	}

	public boolean estLibre(int jour) {

		return jours[jour]; // Renvoie un booléen selon la réponse de jours[jour]
	}
	
	public void reserver(int jour) {
		

		reserver(jour);
	}
}
