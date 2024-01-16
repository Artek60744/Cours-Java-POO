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
        System.out.println("\nLe tableau non trier");
        for (int i = 0; i < arrayPaire.length; i++) {
            arrayPaire[i].affiche();
        }

        Tri.Tribulle(arrayPaire);

        System.out.println("\nLe trie bulle");
        for (int i = 0; i < arrayPaire.length; i++) {
            arrayPaire[i].affiche();
        }

        Paire arrayPaire2[] = {paire1, paire2, paire3, paire4, paire5};
        Tri.TriInsertion(arrayPaire2);

        System.out.println("\nLe trie par insertion");
        for (int i = 0; i < arrayPaire2.length; i++) {
            arrayPaire2[i].affiche();
        }

        Paire arrayPaire3[] = {paire1, paire2, paire3, paire4, paire5};
        Tri.TriFusion(arrayPaire3);

        System.out.println("\nLe trie par fusion");
        for (int i = 0; i < arrayPaire3.length; i++) {
            arrayPaire3[i].affiche();
        }

    }
}
