package src;

public class Document {
    public int numero;
    public String titre;

    public Document(){
        this.numero = 0;
        this.titre = "";
    }

    public Document(int num, String t){
        this.numero = num;
        this.titre = t;
    }

    public String toString(){
        return "Le document à pour numéro:"+this.numero+" et pour titre:"+this.titre;
    }

}
