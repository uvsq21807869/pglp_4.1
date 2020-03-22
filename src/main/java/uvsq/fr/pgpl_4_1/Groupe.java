package uvsq.fr.pgpl_4_1;


import java.util.ArrayList;

public class Groupe  extends Team {

			private final String nom;
			private ArrayList<Personnel> list;
			
			
			public Groupe(String nom) {
				list = new ArrayList<Personnel>(); 
				this.nom = nom;	
			}
			
			
		
			
			public String getNom() {
				return this.nom;
			}


			public void ajoutMembre(Personnel p) {

				list.add(p);

			}

			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}
			
		

		


}
