package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Individu> individuList = new ArrayList<Individu>();
        individuList.add(new Individu("Jean", "Rue du don", "0344102030"));

        System.out.println("Il y a "+individuList.size()+" individu créer:");
        individuList.forEach(individu -> System.out.println(individu.toString()));
    }
    
}