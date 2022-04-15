package gestion_nom;

public class Etudiant {
	private int id;
	private String nom;
	private Double note;
	
	public  Etudiant(int id , String nom) {
		this.id = id;
		this.nom = nom;
		this.note = 10.0;
   }
	public String toString()
	{
		return this.nom+ " : "+this.note;
	}


}
