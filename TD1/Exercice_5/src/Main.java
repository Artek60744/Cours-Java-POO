package src;

public class Main {
    public static void main(String[] args){

        Paire paire1 = new Paire();
        Paire paire2 = new Paire(9, 10);
        Paire paire3 = new Paire(paire2);

        paire1.affiche();
        paire2.affiche();
        paire3.affiche();

        System.out.println("Entier_1:"+paire2.getEntier_1()+" Entier_2:"+paire2.getEntier_2());
        paire2.setEntier_1(5);
        paire2.setEntier_2(8);
        System.out.println("Entier_1:"+paire2.getEntier_1()+" Entier_2:"+paire2.getEntier_2());

    }
}
