package uvsq.fr.pgpl_4_1;

import java.util.List;

public class Annuaire {

	private static Annuaire ANNUAIRE;
	public List<Team> annuaire; 

	private Annuaire() {

	}

	public static Annuaire getInstance() {

		if (ANNUAIRE == null)
			ANNUAIRE = new Annuaire();

		return ANNUAIRE;
	}

}
