package uvsq.fr.pgpl_4_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Personnel {
	private final String nom;
	private final String prenom;
	private final int ID;
  
	private LocalDate dateNaiss;
	private final ArrayList<Integer> numeroTel;
	

	
	public static class Builder{

		private final String nom;
		private final String prenom;
        private final int ID;
                    
		private LocalDate dateNaiss;
		private ArrayList<Integer>  numeroTel;
		
		
		public Builder(String nom, String prenom, int ID ) {
			this.nom = nom;
			this.prenom = prenom;
			this.ID = ID;
			
		}
                    
                    public Builder dateNaiss(int annee, int mois, int jour){
                        this.dateNaiss = LocalDate.of(annee, mois, jour);
                        return this; 
                    }
		
                    public Builder numeroTel(int numeroTel){
                        this.numeroTel.add(numeroTel);
                        return this;
                    }
                    
		public Personnel build() {
			return new Personnel(this);
		}
		
	}
	

	
	private Personnel(Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
        ID = builder.ID;
                    
		dateNaiss = builder.dateNaiss;
		numeroTel = builder.numeroTel;
		
		
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public ArrayList<Integer> getNumeroTel() {
		return numeroTel;
	}

	public LocalDate getDateNaiss() {
		return dateNaiss;
	}

	public int getID() {
		return ID;
	}
	
	@Override
    public String toString(){
        String str = "ID : " + this.ID;
        return str;
    }

	public void print(){
        System.out.println("les infdormtion du personnel sont :  "  +this.ID
                + "  " + this.nom +  "  " + this.prenom);
        
    }
            
            
	

}
