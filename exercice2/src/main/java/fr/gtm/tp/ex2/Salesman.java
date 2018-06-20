package fr.gtm.tp.ex2;

public class Salesman extends Workers {
	
	private double chiffreAffaire ;

	public Salesman(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
		super(nom, prenom, age, dateEntree);
		// TODO Auto-generated constructor stub
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
