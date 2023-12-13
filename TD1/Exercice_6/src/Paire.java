package src;

public class Paire {
    
    // Attribue
    private int x;
    private int y;


    // Constructeur
    Paire(){
        this.x = 0;
        this.y = 0;
    }
    Paire(int x, int y){
        this.x = x;
        this.y = y;
    }
    Paire(Paire paire){
        this.x = paire.x;
        this.y = paire.y;
    }

    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }

    public void setx(int x) {
        this.x = x;
    }

    public void sety(int y) {
        this.y = y;
    }

    // (x1, y1) < (x2, y2) ssi (x1 < x2) ou (x1 = x2 et y1 < y2). 
    public static int comparaison(Paire paire1, Paire paire2){
        if (paire1.x < paire2.x)
            return -1;
        else if (paire1.x == paire2.x && paire1.y < paire1.y)
            return -1;
        else if (paire1.x == paire2.x && paire1.y == paire1.y)
            return 0;
        else
            return 1;
    }


    void affiche(){
        System.out.println("La paire ("+this.x+", "+this.y+")");
    }
}
