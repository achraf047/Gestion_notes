package gestion_nom;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant(1, "hamid");
		Etudiant e2 = new Etudiant(2, "driss");
		Etudiant e3 = new Etudiant(20, "youssef");
        e1.setNote(15.0);
        e2.setNote(12.0);
        e3.setNote(16.0);
		ListEtudiants mesEtudiants = new ListEtudiants();
		mesEtudiants.add(e1); mesEtudiants.add(e2); mesEtudiants.add(e3);
		System.out.println(mesEtudiants);
		Collections.sort(mesEtudiants);
		

	}

}
