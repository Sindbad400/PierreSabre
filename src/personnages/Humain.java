package personnages;

public class Humain {
	private String nom;
	private String favorite_drink;
	private int argent;
	
	public Humain(String nom,String favorite_drink,int argent) {
		this.argent=argent;
		this.favorite_drink=favorite_drink;
		this.nom=nom;
	}

	public String getNom() {
		return nom;
	}

	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getArgent() {
		return argent;
	}
	
	
	public String getFavorite_drink() {
		return favorite_drink;
	}

	public void setFavorite_drink(String favorite_drink) {
		this.favorite_drink = favorite_drink;
	}

	protected void gagnerArgent(int gain) {
		this.argent+=gain;
	}
	protected void perdreArgent(int perte) {
		this.argent-=perte;
	}
	protected void parler(String texte) {
		System.out.println(texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+getNom()+" et j'aime boire du "+getFavorite_drink());
	}
	public void boire() {
		parler("Mmmm, un bon verre de "+getFavorite_drink()+" ! GLOUPS !");
	}
	public void acheter(String bien,int prix) {
		if (prix<=getArgent()) {
			parler("J'ai "+getArgent()+" sous en poche. Je vais pouvoir m'offrir un "+bien+" à "+prix+" sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que "+getArgent()+" sous en poche. Je ne peux même pas m'offrir un "+bien+" à "+prix+" sous");
		}
	}
}
