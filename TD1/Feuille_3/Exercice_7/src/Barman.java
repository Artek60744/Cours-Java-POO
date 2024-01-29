package src;

public class Barman extends Humain{

    private String nom_Bar;

    Barman(String name){
        super(name, "vin");
        this.nom_Bar = "Chez ("+name+")";
    }

    Barman(String name, String nom_Bar){
        super(name, "vin");
        this.nom_Bar = nom_Bar;
    }

    public void servir(Humain humain){
        System.out.println(this.quelEstTonNom()+" sert un verre de "+humain.quelEstTaBoisson()+" à "+humain.quelEstTonNom());
    }

    @Override
    public void parle(String texte){
        System.out.println("("+this.quelEstTonNom()+")- "+texte+" Coco.");
    }
    @Override
    public void presentation() {
        parle("Je suis "+this.quelEstTonNom()+" votre barman et vous étes dans mon bar "+this.nom_Bar);
    }
}
