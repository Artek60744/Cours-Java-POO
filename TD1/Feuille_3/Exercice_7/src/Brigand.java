package src;

import java.util.ArrayList;
import java.util.List;

public class Brigand extends Humain {
    private int nb_enlever;
    private int recompence;
    private boolean prison;

    public List<Dame> enlever;

    Brigand(String nom) {
        super(nom, "tord-boyaux");
        this.nb_enlever = 0;
        this.recompence = 100;
        this.prison = false;
        this.enlever = new ArrayList<>();
    }

    Brigand(String nom, int nb_enlevement, int recompence_capture, boolean is_in_prison) {
        super(nom);
        this.nb_enlever = nb_enlevement;
        this.recompence = recompence_capture;
        this.prison = is_in_prison;
        this.enlever = new ArrayList<>();
    }

    public void kidnapper(Dame dame1){
        this.nb_enlever++;
        dame1.kidnapper();
        enlever.add(dame1);
        this.recompence += 100;
        this.parle("Ah ah !"+dame1.quelEstTonNom()+", tu es mienne désormais !");
    }

    public void emprisoner(Cowboy gars){
        this.prison = true;
        this.parle("Damned, je suis fait !"+gars.quelEstTonNom()+", tu m’as eu !");
        this.enlever.forEach(dame -> dame.liberer(gars));
        this.enlever.clear();
    }

    public int getRecompence(){
        return this.recompence;
    }

    @Override
    public void presentation(){
        this.parle("J'ai l’air méchant et j’ai déjà kidnappé "+this.nb_enlever+" dames !");
        this.parle("Ma tête est mise à prix "+this.recompence+" $ !");
    }
}