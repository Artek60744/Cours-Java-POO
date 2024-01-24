public class Livre extends Document{

    private String auteur;
    private int nb_pages;

    public Document(){
        super(num, titre);
        this.auteur = "";
        this.nb_pages = 0;
    }

    public Document(String auteur, int nb){
        super(num, titre);
        this.auteur = auteur;
        this.nb_pages = nb;
    }

}