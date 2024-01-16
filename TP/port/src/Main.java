package src;
/**
 * main
 */
public class Main {

    public static void main(String[] args) {
        Point p = new Point();
        Point p2 = new Point();
        p2.set(2, 3);
        p.affiche();
        p2.affiche();
        
        // return true si le point est sur (0, 0)
        System.out.println("Le point p est sur l'origine ?"+p.origine());
        System.out.println("Le point p2 est sur l'origine ?"+p2.origine());

        System.out.println("Le point p est égale à p2 ?"+p.egale(p2));

        Point p3 = new Point(2, 3);
        System.out.println("Le point 3:");
        p3.affiche();
        System.out.println("Le point p3 est égale à p2 ?"+p2.egale(p3));
        
        p3.symetrie();
        System.out.println("Symétrie du point3 par rapport à l'origine");
        p3.affiche();

    }
}