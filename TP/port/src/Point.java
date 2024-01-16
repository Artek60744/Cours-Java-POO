package src;
// Fichier Point.java 
public class Point { 
	// deux attributs de type int 
	int abscisse; 
	int ordonnee;
	
	// Petit (5)
	static int nombre;
	int numero;

	// constructeur 
	Point(){ 
		this.abscisse = 0 ;
		this.ordonnee = 0 ;
		this.numero = nombre;
		nombre ++;
	}

	// constructeur 2
	Point(int u, int v){ 
		this.abscisse = u ;
		this.ordonnee = v ;
		this.numero = nombre;
		nombre ++;
	}

    void affiche(){
        System.out.println("Numero:"+this.numero+" Nombre:"+nombre+" Abscisse:"+this.abscisse+" Ordonnée:"+this.ordonnee);
    }

	// méthode permettant de changer les coordonnées d’un point 
	void set( int u , int v ){
		abscisse = u ;
		ordonnee = v ;
	}

	// Méthode set qui copy les attribues de l'object 2 dans notre object
	void set( Point p2){
		this.abscisse = p2.abscisse ;
		this.ordonnee = p2.ordonnee ;
	}

    // Affiche 
    boolean origine(){
        if (this.abscisse == 0 || this.ordonnee == 0)
            return true;
        return false;
    }

    boolean egale(Point point2){
        if (this.abscisse == point2.abscisse && this.ordonnee == point2.ordonnee)
            return true;
        return false;
    }

	// méthode permettant de translater un point
	void translate( int u , int v ){
		abscisse = abscisse + u ; 
		ordonnee = ordonnee + v ; 
	}

	Point symetrie(){
		this.abscisse = -this.abscisse;
		this.ordonnee = -this.ordonnee;
		return this;
	}
}
