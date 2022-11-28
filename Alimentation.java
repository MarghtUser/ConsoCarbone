package consoCarbone;

public class Alimentation extends ConsoCarbone{
	private double txBoeuf;
	private double txVege;
	//valeurs constantes
	private final double cB=8.0;
	private final double cV=0.9;
	private final double cVB=1.6;
	
	
	//constructeur par défaut:
	public Alimentation(){
	   super();
	   txBoeuf=0;
	   txVege=0;
	   impact=0;
	}
	
	
	//constructeur
	public Alimentation(double txBoeuf,double txVege){
		super();
	    // il y a beaucoup de decimales 
		impact=cB*txBoeuf+cVB*(1-txVege-txBoeuf)+cV*txVege;
		this.txBoeuf=txBoeuf;
		this.txVege=txVege;
	}
	
	public double getTxBoeuf() {
		return txBoeuf;
	}

	public void setTxBoeuf(double txBoeuf) {
		this.txBoeuf = txBoeuf;
	}

	public double getTxVege() {
		return txVege;
	}

	public void setTxVege(double txVege) {
		this.txVege = txVege;
	}

	public double getImpact() {
		return impact;
	}
	
	public static void EC_alimentation(){
		System.out.println("\nFUN FACT : L'empreinte carbone moyen d'un.e français.e concernant son alimentation est de 2328 Kg de CO2 par an");
	}
	
    @Override
    public String toString(){ 
    	return "\nLe taux de repas à base de boeuf consommés est de " + txBoeuf*100  + "% et le taux de repas végétariens consommés est de " + txVege*100 +"%."+super.toString();
    }
}