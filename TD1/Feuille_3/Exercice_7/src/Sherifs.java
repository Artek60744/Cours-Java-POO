package src;

public class Sherifs extends Cowboy{

    private int nb_brigand_attraper;
    Sherifs(String nom) {
        super(nom, "honnêtes");
        this.nb_brigand_attraper = 0;
    }

    public void coffre(Brigand bandito){
        this.tire(bandito);
        parle("Au nom de la loi, je vous arrête !");
        bandito.emprisoner(this);
        this.nb_brigand_attraper++;
    }
    public void rechercher(Brigand bandito){
        parle("'Placarde une affiche dans toute la ville'");
        parle("\"OYEZ OYEZ BRAVES GENS ! ! "+bandito.getRecompence()+"$ a " +
                "qui arrêtera "+bandito.quelEstTonNom()+" le brigand mort ou vif ! !\"");
    }

    @Override
    public void presentation(){
        parle("Je suis "+this.quelEstTonNom()+" le sherif!! et j'ai coffré pas moins de "+
                    this.nb_brigand_attraper+" brigand dans ma vie");
    }

    // On override quelEstTonNom car "Il refuse de se faire appeler
    // autrement que par "Shérif son nom"
    @Override
    public String quelEstTonNom(){
        return "Sherif "+super.quelEstTonNom();
    }
}
