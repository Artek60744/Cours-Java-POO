import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Individu> individuList = new ArrayList<Individu>();
        individuList.add(new Individu("Jean", "Balsac", "Rue du don", "0344102030"));

        System.out.println("Il y a "+individuList.size()+" individu créer:");
        individuList.forEach(individu -> System.out.println(individu.toString()));


        Etudiant x=new Etudiant("Dupond","Jean","11 rue du bonheur","0491222222","Philosophie",123);
        Etudiant y=new Etudiant("Java","Jaime","13 Avenue de la programmation","11111111","Informatique",
                115) ;
        Etudiant z=new Etudiant("Tragique","Romeo","3 Boulevard Shakespeare","","Litterature",666);
        Individu t=new Individu("Stallman","Richard","5 rue du libre","0101010");

        x.afficher();
        t.afficher();
        t=x;
        t.afficher();
        y=(Etudiant)t;
        y.afficher();
    }

}