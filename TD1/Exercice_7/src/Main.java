package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Individu> individuList = new ArrayList();
        individuList.add(new Individu("Jean", "rue du don", "0344102030"));


        System.out.println( individuList.size() );  

    }

}
