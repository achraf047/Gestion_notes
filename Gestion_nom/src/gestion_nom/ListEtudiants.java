package gestion_nom;

import java.util.ArrayList;

public class ListEtudiants extends ArrayList<Etudiant> {
	@Override
	public boolean add(Etudiant e) {
		if (this.contains(e))
			return false;
		// TODO Auto-generated method stub
		else
			return super.add(e);
		
	}

}
