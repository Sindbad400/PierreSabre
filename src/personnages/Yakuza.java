package personnages;

public class Yakuza extends Humain {
	String clan;
	int rep=0;
	
	public Yakuza(String nom,int argent,String favorite_drink,String clan) {
		super(nom,favorite_drink,argent);
		this.clan=clan;
	}
	
	
	
	public int getRep() {
		return rep;
	}


	public void Extorquer(Commercant victime) {
		int argent=victime.seFaireExtorquer();
		parler("J'ai piqué "+argent+" sous à "+victime.getNom()+", ça me fait "+(getArgent()+argent)+" sous en poche !");
		rep++;
	}
	
	public int perdre() {
		int argent=getArgent();
		perdreArgent(argent);
		if(this.rep>0) {
			this.rep--;
		}
		parler("J'ai perdue mon duel et mes "+getArgent()+" sous ! J'ai déshonnoré le clan "+this.clan);
		return argent;
	}
	public void gagner(int gain) {
		gagnerArgent(gain);
		this.rep++;
		parler("Ce Ronin pensait vraiment pouvoir vaincre "+getNom()+" du clan "+this.clan+"! Je l'ai dépouillé de ses "+gain+" sous !");
	}
	
}
