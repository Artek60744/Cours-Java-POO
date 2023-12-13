package src;

public class Main {
    public static void main(String[] args){

        Paire paire1 = new Paire();
        Paire paire2 = new Paire(9, 10);
        Paire paire3 = new Paire(paire2);
        Paire paire4 = new Paire(1, 2);
        Paire paire5 = new Paire(3, 5);

        paire1.affiche();
        paire2.affiche();
        paire3.affiche();

        System.out.println("Entier_1:"+paire2.getx()+" Entier_2:"+paire2.gety());
        paire2.setx(5);
        paire2.setx(8);
        System.out.println("Entier_1:"+paire2.getx()+" Entier_2:"+paire2.gety());

        Paire arrayPaire[] = {paire1, paire2, paire3, paire4, paire5};
        Tri.Tribulle(arrayPaire);

        for (int i = 0; i < arrayPaire.length; i++) {
            arrayPaire[i].affiche();
        }

    }
}
