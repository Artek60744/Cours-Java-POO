public class Dictionnaire extends Document{

    private String langue;
    private int nb_tomes;
    public Dictionnaire(){
        super(num, titre);
        this.langue = "Français";
        this.nb_tomes = 0;
    }

    public Dictionnaire(String langue, int nb){
        super(num, titre);
        this.langue = langue;
        this.nb_tomes = nb;
    }

}