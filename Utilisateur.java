package package2;

import consoCarbone.Alimentation;
import consoCarbone.BienConso;
import consoCarbone.ConsoCarbone;
import consoCarbone.Logement;
import consoCarbone.Transport;
import consoCarbone.ServicesPublic;

public class Utilisateur{
	public Alimentation alimentation;
	public BienConso bienConso;
	public Logement logement;
	public Transport transport;
	public ServicesPublic services;
	private double d;
	private ConsoCarbone[] tabconso= {alimentation,bienConso,logement,transport,services};
	
	public Utilisateur() {
	}
	
	
	public double calculerEmpreinte() {
		for(int i=0;i<5;i++)
	    	d = d+tabconso[i].getImpact();
	    return(d);
	}
	public void detaillerEmpreinte() {
		for(int i=0;i<5;i++)
	    	System.out.println(tabconso[i].toString());
	}
	public static void main(String[] args) {
		
	}
}