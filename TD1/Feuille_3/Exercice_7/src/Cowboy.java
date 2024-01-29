package src;

public class Cowboy extends Humain{

    private int populariter;
    private String adjectif;

    Cowboy(String nom) {
        super(nom, "whisky");
        this.populariter = 0;
        this.adjectif = "populaire";
    }
    Cowboy(String nom, String adjectif) {
        super(nom, "whisky");
        this.populariter = 0;
        this.adjectif = adjectif;
    }

    public void tire(Brigand bandito){
        this.parle("Le "+this.adjectif+" "+this.quelEstTonNom()+" tire sur "+bandito.quelEstTonNom()+". PAN !");
        this.parle("Prend ça, crapule !");
    }

    @Override
    public void presentation(){
        parle("Je suis "+this.quelEstTonNom()+" le cowwwboy!!");
    }

}
