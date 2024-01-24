public class Etudiant extends Individu{
    private String formation;
    private int num_etudiant;
    private Individu individu = new Individu();

    Etudiant(String nom, String prenom, String adresse, String numero, String formation, int num){
        super(nom, prenom, adresse, numero);
        this.formation = formation;
        this.num_etudiant = num;
    }

    public void afficher(){
        System.out.println(this.toString());
    }

    public String toString(){
        return "Monsieur "+this.nom+", habite à "+this.adresse+" et a pour numéro de téléphone :"+this.numero+" formation: "+this.formation+" num:"+this.num_etudiant+".";
    }
}
