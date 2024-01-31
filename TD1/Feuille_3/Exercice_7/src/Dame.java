package src;

public class Dame extends Humain{
    private String couleur_robe;
    private boolean captive;

    Dame(String nom) {
        super(nom, "lait");
        this.couleur_robe = "blache";
        this.captive = false;
    }
    Dame(String nom, String couleur_robe, boolean captive) {
        super(nom, "lait");
        this.couleur_robe = couleur_robe;
        this.captive = false;
    }

    public boolean kidnapper() {
        if(!this.captive)
            this.captive = true;
        else
            return false;
        parle("Ah ! je suis kidnappée !");
        return true;
    }

    public void liberer(Cowboy cowboy) {
        this.captive = false;
        parle("Merci, " + cowboy.quelEstTonNom() + ", de m'avoir libérée !");
    }

    @Override
    public String quelEstTonNom() {
        return "Miss "+super.quelEstTonNom();
    }

    @Override
    public void presentation() {
        parle("");
    }
}
