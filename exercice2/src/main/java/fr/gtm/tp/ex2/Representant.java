package fr.gtm.tp.ex2;

public class Representant extends Workers {
	
	private double chiffreAffaire ;

	public Representant(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
		super(nom, prenom, age, dateEntree);
		this.chiffreAffaire = chiffreAffaire ;
	}

	@Override
	public double calculSalaire(double chiffreAffaire) {
		
		return 400 + (0.2*this.getChiffreAffaire());
	}

	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	
	

}
