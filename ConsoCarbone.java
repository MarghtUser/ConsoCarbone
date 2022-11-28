package consoCarbone;

public class ConsoCarbone {
	protected double impact;
	private final int ID;
	private static int cpt;
	
	//constructeur par defaut
	public ConsoCarbone() {
		impact = 0;
		cpt++;
		ID = cpt;
	}
	
	//constructeur
	public ConsoCarbone(double impact) {
		this.impact = impact;
		cpt++;
		ID = cpt;
	}
	
	public double getImpact() {
		return impact;
	}
	public int getID() {
		return ID;
	}
	
	public String toString(){   
		String impact2 = String.format("%.02f", impact);
		return "\nL'empreinte carbone est donc de "+impact2+" TCO2eq.";
    }
}
