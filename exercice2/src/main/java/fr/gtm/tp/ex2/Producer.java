package fr.gtm.tp.ex2;

public class Producer extends Workers {
	
	private int unitesProduites ;

	public Producer(String nom, String prenom, int age, String dateEntree, int unitesProduites) {
		super(nom, prenom, age, dateEntree);
		this.unitesProduites = unitesProduites ; 
	}

	@Override
	public double calculSalaire(double chiffreAffaire) {
		
		return 0;
	}

}
