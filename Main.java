package consoCarbone;
import java.util.Scanner;

public class Main{
	// faire des fonctions pour synthetiser 
	public static void main(String[] args) throws InterruptedException{ 
		
		System.out.println("----------------------------------------------------------");
		System.out.println("| BIENVENUE DANS LE CALCULATEUR D'EMPREINTE CARBONE 2000 |");
		System.out.println("----------------------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
        
	    //on declare les variables qu'on va utiliser pour creer un element de notre classe logement
	    int superficie;
	    String ce; 
	    
	    System.out.println("Bonjour, nous allons d'abord calculer l'empreinte carbone de votre logement !");
	    System.out.println("Afin de mettre en oeuvre mon talent, je vais toutefois avoir besoin de votre coopération :)");
	    System.out.println("Commençons. Pouvez-vous me donner la superficie de votre logement en m2 ?");
	    superficie = scanner.nextInt();  

	    System.out.println("\nPouvez-vous maintenant m'indiquer la classe energetique de votre logement ?");
	    System.out.println("La classe énergétique de votre logement correspond à l'une des six suivantes: A,B,C,D,E,F ou G.");
	    ce = scanner.next();   
        
	    //creation de l'element logement de la classe Logement avec les informations qu'on a recuperes
	    Logement logement = new Logement(superficie, CE.valueOf(ce));   
	    
	    Logement.EC_logement();
	    System.out.println(logement.toString());
	    //pk pas rajouter une phrase qui dit si la personne est au dessus ou en dessous de la moyenne nationale de consommation 
	    
	    
	    
	    // --------------------- 
	    
	    String voiture; // on l'utilise pour savoir si l'utilisateur possède une voiture ou non 
	    String t; // pour recuperer la taille de la voiture s'il y en bien une
	    boolean possede;
		Taille taille;
		int kilomAnnee;
		int amortissement;
		
	    
	    System.out.println("\nNous allons maintenant calculer l'empreinte carbone liée à votre utilisation d'un transport automobile !");
	    System.out.println("Je vais encore avoir besoin de votre coopération :).");
	    System.out.println("Commençons. Pouvez-vous me dire si vous possédez une voiture (oui/non) ?");
	    voiture = scanner.next();  

    	//cas ou l'utilisateur ne possede pas de voiture
    	Transport voit=new Transport(); // appeler le constructeur par defaut suffit car aucune valeur ne va m'etre utile et possede est mis à false dans le constructeur par defaut
    	//voit.EC_Transport();
    	//System.out.println(voit.toString());
   
	    //on compare des chaines de caracteres 
	    if ("oui".equals(voiture)) {
	    	//cas ou l'utilisateur possede une voiture
	    	possede=true;
	    	System.out.println("Pouvez-vous maitenant me donner la taille de votre voiture (petite/grande) ?");
	    	t=scanner.next();
	    	// selon si la voiture est petite ou grande on ne lui affecte pas le meme element de la classe enumeration (P ou G)
	    	if ("petite".equals(t)){
	    		taille = Taille.P;
	    		System.out.println("Pouvez-vous m'indiquer le nombre exacte de kilomètres parcourus avec cette voiture durant la dernière année ? ");
	    		kilomAnnee=scanner.nextInt();
	    		System.out.println("Les préparatifs sont bientôt finis il ne me reste plus qu'à savoir depuis combien de temps, en années, vous possédez ce véhicule?");
	    		amortissement=scanner.nextInt();
	    		voit=new Transport(possede,taille,kilomAnnee,amortissement);
	    		Transport.EC_Transport();
		    	System.out.println(voit.toString());
	    	}
	    	else {
	    		taille = Taille.G;
	    		System.out.println("Pouvez-vous m'indiquer le nombre exacte de kilomètres parcourus avec cette voiture durant la dernière année ? ");
	    		kilomAnnee=scanner.nextInt();
	    		System.out.println("Les préparatifs sont bientôt finis il ne me reste plus qu'à savoir depuis combien de temps, en années, vous possédez ce véhicule?");
	    		amortissement=scanner.nextInt();
	    	    voit=new Transport(possede,taille,kilomAnnee,amortissement);
	    		Transport.EC_Transport();
		    	System.out.println(voit.toString());
	    	}
	    	
	    }
	    else {
	    	Transport.EC_Transport();
	    	System.out.println(voit.toString());
	    }
	    
	    
	    //---------------------
	    
	    //on declare les variables qu'on va utiliser pour creer un element de notre classe BienConso
	    double montant;
	    
	    System.out.println("\nCalculons l'empreinte carbone de vos biens de consommation!");
	    System.out.println("Commençons. Pouvez-vous me donner me donner le montant de vos dépenses annuelles en euros ?");
	    montant = scanner.nextDouble();  
        
	    //creation de l'element logement de la classe Logement avec les informations qu'on a recuperes
	    BienConso bc = new BienConso(montant);   
	    
	    BienConso.EC_BienConso();
	    System.out.println(bc.toString());
	    //pk pas rajouter une phrase qui dit si la personne est au dessus ou en dessous de la moyenne nationale de consommation 
	    
	    
	    // --------
	    
	    double txBoeuf;
	    double txVege; 
	    
	    System.out.println("\nCalculons l'empreinte carbone de votre alimentation!");
	    System.out.println("Commençons. Pouvez-vous me donner le taux de repas à base de boeuf que vous dévorer en moyenne (entrez une valeur entre O et 1) ?");
	    txBoeuf = scanner.nextDouble();  

	    System.out.println("\nPouvez-vous maintenant m'indiquer le taux de repas végétariens que vous savourez en moyenne (entrez une valeur entre O et 1) ?");
	    txVege = scanner.nextDouble();   
        
	    //creation de l'element alim de la classe Alimentation avec les informations qu'on a recuperes
	    Alimentation alim = new Alimentation(txBoeuf, txVege);   
	    
	    Alimentation.EC_alimentation();
	    System.out.println(alim.toString());
	    //pk pas rajouter une phrase qui dit si la personne est au dessus ou en dessous de la moyenne nationale de consommation 
	    
	    
	
	    //test du polymorphisme:
	    //creeons un tableau qui contient la consommation carbone liée dans cet ordre à l'alimentation, au logement, aux biens de consommations et au transport d'une personne fictive
	    System.out.println("\n\n---------------------------------------------");
		System.out.println("| RECAPITULATIF DE VOTRE EMPREINTE CARBONE  |");
		System.out.println("---------------------------------------------");
		System.out.println("Les empreintes carbones seront donnés dans cet ordre: Alimentation, logement, biens de consommation, transport. ");
		
	    ConsoCarbone[] tabconso= {alim,logement,bc,voit};
	    for(int i=0;i<4;i++)
	    	System.out.println(tabconso[i].toString());
	    
	    scanner.close();
	}
}

