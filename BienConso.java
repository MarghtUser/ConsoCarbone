package consoCarbone;

public class BienConso extends ConsoCarbone{
	private double montant;
	// 1 TCO2eq = 1750€ de dépenses	
	
	//constructeur par défaut
	public BienConso() {
		super();
		montant=0;
		impact=0;
	}
	
	//constructeur
	public BienConso(double montant) {
		super();
		this.montant=montant;
	    impact=montant/1750;
	}
	
	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

    //Empreinte carbonne moyenne d'un français vis à vis des dépenses anuelles 
	public static void EC_BienConso(){
	    System.out.println("\nFUN FACT : L'empreinte carbone moyen d'un.e français.e concernant les biens de consommations est de 2625 Kg de CO2 par an?");
	}
	
	@Override
    public String toString(){  
		return "\nLe montant des dépenses annuelles est de " + montant +"euros."+super.toString();
    }
			
}