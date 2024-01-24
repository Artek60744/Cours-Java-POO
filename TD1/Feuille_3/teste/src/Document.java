public class Document {

    int numero;
    String titre;

    Document(){
        this.numero = 0;
        this.titre = "";
    }

    Document(int num, String titre){
        this.numero = num;
        this.titre = titre;
    }

    public String toString(){
        return "Monsieur "+this.nom+", habite à "+this.adresse+" et a pour numéro de téléphone :"+this.numero+".";
    }

}
