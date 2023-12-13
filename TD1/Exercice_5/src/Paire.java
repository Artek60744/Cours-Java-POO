package src;

public class Paire {
    
    // Attribue
    private int entier_1;
    private int entier_2;


    // Constructeur
    Paire(){
        this.entier_1 = 0;
        this.entier_2 = 0;
    }
    Paire(int x, int y){
        this.entier_1 = x;
        this.entier_2 = y;
    }
    Paire(Paire paire){
        this.entier_1 = paire.entier_1;
        this.entier_2 = paire.entier_2;
    }

    public int getEntier_1() {
        return this.entier_1;
    }

    public int getEntier_2() {
        return this.entier_2;
    }

    public void setEntier_1(int entier_1) {
        this.entier_1 = entier_1;
    }

    public void setEntier_2(int entier_2) {
        this.entier_2 = entier_2;
    }

    void affiche(){
        System.out.println("La paire ("+this.entier_1+", "+this.entier_2+")");
    }
}
