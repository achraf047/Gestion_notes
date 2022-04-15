package gestion_nom;

import aiac.gi18.java.complexe.Complexe;

public class Etudiant implements Comparable<Etudiant> {
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

	@Override
	public int compareTo(Etudiant e) {
		if(this.note==e.note) return 0;
		if(this.note>e.note) return 1;
		return -1;
		// TODO Auto-generated method stubs
	}

}
