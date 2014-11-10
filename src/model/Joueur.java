package model;

public class Joueur {//implements InterfaceJoueur{
	public enum typeJoueur{
		HUMAIN,
		MACHINE,
		NOTYPE
	}
	
	private typeJoueur type;
	private String nom;
	/*declaration ici un tableau dynamique de pointeurs sur la methode qui cree les bateaux*/
	
	public Joueur(typeJoueur type, String nom){
		this.type = type;
		this.nom = nom;
		/*Initialiser ici les bateaux d'un joueur*/
	}
	/*
	 * Initialise
	 * et retourne un joueur
	 * */
	public Joueur creerJoueur(typeJoueur type, String nom){
		Joueur joueur = new Joueur(type, nom);
		
		joueur.type = typeJoueur.NOTYPE;
		joueur.nom = "";
		
		return joueur;		
	}
	
	public typeJoueur getTypeJoueur(Joueur typeJ){
		return typeJ.type;
	}
	public String getNomJoueur(Joueur nomJ){
		return nomJ.nom;
		
	}
	
	public void libererJoueur(Joueur pj){
		System.gc();
	}

}
