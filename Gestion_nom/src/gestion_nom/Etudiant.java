package gestion_nom;

import aiac.gi18.java.complexe.Complexe;

public class Etudiant {
	private int id;
	private String nom;
	private Double note;

	public Etudiant(int id, String nom) {
		this.id = id;
		this.nom = nom;
		this.note = 10.0;
	}

	public String toString() {
		return this.nom + " : " + this.note;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Etudiant)) {
			return false;
		}
		return ((Etudiant) obj).id == this.id;
	}

}
