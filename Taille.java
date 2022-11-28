package consoCarbone;

public enum Taille{
	P(4.2),G(19);

	private double emission;
	Taille(double e){
		this.emission = e;
	}
	public double getEmission() {
		return emission;
	}
}
