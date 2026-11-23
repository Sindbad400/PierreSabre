package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

    public static void main(String[] args) {
    	Commercant marco=new Commercant("Marco",20);
    	Ronin roro=new Ronin("Roro","shoshu",30);
    	Yakuza yaku=new Yakuza("Yaku",30,"Whisky","Warsong");
    	roro.provoquer(yaku);
    }
}