package consoCarbone;

public class Transport extends ConsoCarbone{
	private boolean possede;
	private Taille taille;
	private int kilomAnnee;
	private int amortissement;
	
	//constructeur par defaut
	public Transport() {
		super();
		possede=false;
		taille=Taille.P; // en realite ca n'a pas de sens mais il faut bien initialiser la variable déclarées comme Taille
		kilomAnnee=0;
		amortissement=0;
		impact=0;
	}
	
	//constructeur
	public Transport(boolean possede,Taille taille,int kilomAnnee,int amortissement) {
		super();
		this.possede=possede;
		this.taille=taille;
	    this.kilomAnnee=kilomAnnee;
	    this.amortissement=amortissement;
	    if (possede == false)
			impact = 0;
		impact = kilomAnnee * 1.93 * 0.0001 + taille.getEmission()/amortissement;
	
	}
	
	public boolean isPossede() {
		return possede;
	}

	public void setPossede(boolean possede) {
		this.possede = possede;
	}

	public Taille getTaille() {
		return taille;
	}

	public void setTaille(Taille taille) {
		this.taille = taille;
	}

	public double getKilomAnnee() {
		return kilomAnnee;
	}

	public void setKilomAnnee(int kilomAnnee) {
		this.kilomAnnee = kilomAnnee;
	}

	public int getAmortissement() {
		return amortissement;
	}

	public void setAmortissement(int amortissement) {
		this.amortissement = amortissement;
	}

	//Empreinte carbonne moyenne d'un français vis à vis du transport
	public static void EC_Transport(){
	    System.out.println("\nFUN FACT : L'empreinte carbone moyen d'un.e français.e concernant le transport est de 2920 Kg de CO2 par an.");
	}
	
	@Override
    public String toString(){  
        //cas ou l'utilisateur n'a pas de voiture:
	    if (possede==false) return("\nVous ne possèdez pas de voiture."+super.toString());
	    //sinon l'utilisateur possede une voiture
	    if (taille==Taille.P) return ("\nVous possèdez une petite voiture depuis "+ amortissement +" ans, et vous avez parcouru "+ kilomAnnee+ "km avec."+super.toString());
	    return("\nVous possèdez une grande voiture depuis "+ amortissement +" ans, et vous avez parcouru "+ kilomAnnee+ "km avec."+super.toString());
	
    }	
}