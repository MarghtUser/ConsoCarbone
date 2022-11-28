package consoCarbone; 

public class Logement extends ConsoCarbone{
	private int superficie;
	private CE ce;
	
	
	//constructeur par défaut:
	public Logement(){
		super();
		superficie=0;
		ce=CE.G;  //le pire des cas est applique si l'utilisateur ne nous donne pas l'information
		impact=0;
	}
	
	//constructeur
	public Logement(int superficie,CE ce){
      super();
	  this.superficie=superficie;
	  this.ce=ce;
	  switch(ce){
		case A:
			impact = 0.005 * superficie;
			break;
		case B:
			impact = 0.01 * superficie;
			break;
		case C:
			impact = 0.02 * superficie;
			break;
		case D:
			impact = 0.035 * superficie;
			break;
		case E:
			impact = 0.055 * superficie;
			break;
		case F:
			impact = 0.08 * superficie;
			break;
		case G:
			impact = 0.1 * superficie;
			break;
	  }
	}
	
	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public CE getCe() {
		return ce;
	}

	public void setCe(CE ce) {
		this.ce = ce;
	}

	public double getImpact() {
		return impact;
	}
	
	//une methode statique detaillant sur la console l’empreinte carbone moyenne d’un.e francais.e 
	public static void EC_logement(){
	  System.out.println("\nFUN FACT : L'empreinte carbone moyen d'un.e français.e concernant le logement est de 2706 Kg de CO2 par an ?");
	}
	
    @Override
    public String toString(){ 
    	return "\nLa superficie du logement est de " + superficie + "m² et sa classe énérgétique est " + ce +"."+super.toString();
    }	
}

