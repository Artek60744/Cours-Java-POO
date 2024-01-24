public class Individu {

    String nom;
    String prenom;
    String adresse;
    String numero;

    Individu(){
        this.nom = "";
        this.prenom = "";
        this.adresse = "";
        this.numero = "";
    }

    Individu(String nom, String prenom, String adresse, String numero){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numero = numero;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNom(){
        return this.nom;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public String getNumero(){
        return this.numero;
    }

    public void afficher(){
        System.out.println(this.toString());
    }
    public String toString(){
        return "Monsieur "+this.nom+", habite à "+this.adresse+" et a pour numéro de téléphone :"+this.numero+".";
    }

}
