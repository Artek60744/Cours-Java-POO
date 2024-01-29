package src;

import java.awt.image.BandCombineOp;

public class Histoire {

    public static void main(String[] args){

        Humain h1 = new Humain("Pierre");
        h1.presentation();
        h1.boire();

        Dame Marie = new Dame("Marie");
        Brigand Tony = new Brigand("Tony");
        Cowboy Luc = new Cowboy("Luc");

        Tony.kidnapper(Marie);
        Luc.tire(Tony);

        Barman clement = new Barman("Clement");
        clement.presentation();
        clement.servir(Luc);
        clement.servir(Tony);
        clement.parle("Salut les khey");

        System.out.println("------------------------------");

        Sherifs Dani = new Sherifs("Dani");
        Brigand fred = new Brigand("Fred");
        Dani.presentation();
        fred.presentation();
        fred.kidnapper(Marie);
        Dani.rechercher(fred);
        Dani.coffre(fred);

    }
}
