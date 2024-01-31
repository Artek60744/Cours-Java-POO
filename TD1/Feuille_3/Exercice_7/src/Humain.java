package src;

public class Humain {

    private String name;
    private String boisson;

    Humain(String nom){
        this.name = nom;
        this.boisson = "eau";
    }

    Humain(String nom, String boisson){
        this.name = nom;
        this.boisson = boisson;
    }

    public void parle(String texte){
        System.out.println("("+name+")- "+texte);
    }

    public void presentation(){
        parle("Bonjour, mon nom est "+name+", et ma boisson favorite c'est "+boisson);
    }

    public void boire(){
        System.out.println("Ah ! un bon verre de "+boisson+" ! GLOUPS !");
    }

    public String quelEstTonNom(){
        return name;
    }
    public String quelEstTaBoisson(){
        return boisson;
    }
}
