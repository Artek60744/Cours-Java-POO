package src;

public class Bibliotheque {

    public static void main(String[] args){

        Document doc1 = new Document(10, "La riviere au bord de l'eau" );
        Document doc2 = new Document(500, "L'arbre au bord de la foret" );
        Livre livre1 = new Livre(500, "L'arbre au bord de la foret", "Jean", 150 );
        Dictionnaire dico1 = new Dictionnaire();

        ListeDeDocuments listeDeDocuments = new ListeDeDocuments();
        listeDeDocuments.add_to_list(doc1);
        listeDeDocuments.add_to_list(doc2);
        listeDeDocuments.add_to_list(livre1);
        listeDeDocuments.tousLesAuteurs();
        listeDeDocuments.tousLesDocuments();

    }
}
