package src;

public class Livre extends Document{

    private String auteur;
    private int nb_pages;
    private Document doc = new Document();

    public Livre(){
        super();
        this.auteur = "";
        this.nb_pages = 0;
    }

    public Livre(int numero, String titre, String auteur, int nb){
        super(numero, titre);
        this.auteur = auteur;
        this.nb_pages = nb;
    }

    public String getAuteur(){
        return this.auteur;
    }

    public int getNb_page(){
        return this.nb_pages;
    }

    public String toString(){
        return super.toString()+", auteur:"+ this.auteur +", Nb_Pages:"+this.nb_pages;
    }

}
