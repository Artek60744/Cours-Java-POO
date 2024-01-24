package src;

public class Dame extends Humain{
    String couleur_robe;
    boolean captive;

    Dame(String nom, String couleur_robe, boolean captive) {
        super(nom);
        this.couleur_robe = couleur_robe;
        this.captive = false;
    }

    public void kidnapper() {
        this.captive = true;
        parle("Ah ! je suis kidnappée !");
    }

    public void liberer(Cowboy cowboy) {
        this.captive = false;
        parle("Merci, " + cowboy.quelEstTonNom() + ", de m'avoir libérée !");
    }

    @Override
    public String quelEstTonNom() {
        return "Miss " + this.quelEstTonNom();
    }
}
