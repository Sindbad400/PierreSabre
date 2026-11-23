package personnages;

public class Ronin extends Humain {
	int honneur=1;
	
	public Ronin(String nom,String favorite_drink,int argent) {
		super(nom,favorite_drink,argent);
	}
	public void donner(Commercant beneficiaire) {
		int donation=getArgent()/10;
		parler(beneficiaire.getNom()+" prends ces "+donation+" sous");
		beneficiaire.recevoir(donation);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force=this.honneur*2;
		if(force>=adversaire.getRep()) {
			gagnerArgent(adversaire.perdre());
			this.honneur++;
			parler("Je t'ai eu sale yakuza !");
		}
		else {
			if(this.honneur>=0) {
				this.honneur--;
			}
			int gain=getArgent();
			adversaire.gagner(gain);
			perdreArgent(gain);
			parler("J'ai perdue, mon honneur et ma bourse en ont pris un coup");
		}
	}
}
