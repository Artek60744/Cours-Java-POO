package src;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class ListeDeDocuments {

    private List<Document> docList;
    public ListeDeDocuments(){
        this.docList = new ArrayList<Document>();
    }

    public void add_to_list(Document doc){
        this.docList.add(doc);
    }

    public void tousLesAuteurs(){
        this.docList.forEach(document -> {
            if (document instanceof Livre){
                System.out.println("Numero:"+document.numero+" Auteur:"+((Livre) document).getAuteur());
            }
        });
    }

    public void tousLesDocuments(){
        this.docList.forEach(document -> {
            System.out.println(document);
        });
    }
}
