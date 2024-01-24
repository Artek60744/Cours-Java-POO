package src;

public class Dictionnaire extends Document{

    private String langue;
    private int nb_tomes;
    private Document doc = new Document();

    public Dictionnaire(){
        super();
        this.langue = "Français";
        this.nb_tomes = 0;
    }

    public Dictionnaire(int numero, String titre, String langue, int nb){
        super(numero, titre);
        this.langue = langue;
        this.nb_tomes = nb;
    }

    public String toString(){
        return super.toString()+", langue:"+ this.langue +", Nb_Tomes:"+this.nb_tomes;
    }
}