package src;

public class Humain {

    private String name;
    private String boisson;

    Humain(String nom){
        this.name = nom;
        this.boisson = "eau";
    }

    public void parle(String texte){
        System.out.println("("+this.name+")- "+texte);
    }

    public void presenter(){
        System.out.println("Bonjour, mon nom est "+this.name+", et ma boisson favorite c'est "+this.boisson);
    }

    public void boire(){
        System.out.println("Ah ! un bon verre de "+this.boisson+" ! GLOUPS !");
    }

    public String quelEstTonNom(){
        return this.name;
    }
    public String quelEstTaBoisson(){
        return this.boisson;
    }
}
