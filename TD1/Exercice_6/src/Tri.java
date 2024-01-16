package src;

public class Tri {

    public static void Tribulle(Paire arrayPaire[]){

        boolean is_trier;
        for (int i = arrayPaire.length; i > 0; i-=1) {
            is_trier = true;
            for (int j = 0; j < i-1; j++) {
                if ( Paire.comparaison(arrayPaire[j+1], arrayPaire[j]) == -1 ) {
                    Paire paire_temp = new Paire(arrayPaire[j+1]);
                    arrayPaire[j+1] = arrayPaire[j];
                    arrayPaire[j] = paire_temp;
                    is_trier = false;
                }
            }
            // Quite la fonction si tous le tableau à été parcourue sans changement
            if (is_trier)
                return;
        }

    }

    public static void TriInsertion(Paire arrPaire[]) 
     {  
          int taille = arrPaire.length;  
        
          for (int i = 1; i < taille; i++)
          { 
               Paire index = arrPaire[i];

               int j = i-1;  
            
               while(j >= 0 && (Paire.comparaison(arrPaire[j], index) == 1))
               {
                    arrPaire[j+1] = arrPaire[j];  
                    j--;  
               }  
               arrPaire[j+1] = index; 
        }  
     }

    public static void TriFusion(Paire arrPaire[]){
        if (arrPaire.length>0)
            decoupe(arrPaire,0,arrPaire.length-1);
        else
            System.out.println("Le tableau dois comporter au moins 2 éléments !");
    }

    private static void decoupe(Paire arrPaire[],int deb,int fin){
        if (deb!=fin){
            int milieu=(fin+deb)/2;
            decoupe(arrPaire,deb,milieu);
            decoupe(arrPaire,milieu+1,fin);
            fusion(arrPaire,deb,milieu,fin);
        }
    }

    private static void fusion(Paire arrPaire[],int deb1,int fin1,int fin2)
    {
        int deb2=fin1+1;

        //on recopie les éléments du début du tableau
        Paire arrPaire1[] = new Paire[fin1-deb1+1];
        for(int i=deb1;i<=fin1;i++){
            arrPaire1[i-deb1]=arrPaire[i];
        }
        
        int compt1=deb1;
        int compt2=deb2;
        
        for(int i=deb1;i<=fin2;i++){        
            if (compt1==deb2) //c'est que tous les éléments du premier tableau ont été utilisés
                break; //tous les éléments ont donc été classés
            else if (compt2==(fin2+1)){ //c'est que tous les éléments du second tableau ont été utilisés
                arrPaire[i]=arrPaire1[compt1-deb1]; //on ajoute les éléments restants du premier tableau
                compt1++;
            }
            else if ( Paire.comparaison(arrPaire1[compt1-deb1], arrPaire[compt2])  == -1 ){
                arrPaire[i]=arrPaire1[compt1-deb1]; //on ajoute un élément du premier tableau
                compt1++;
            }
            else{
                arrPaire[i]=arrPaire[compt2]; //on ajoute un élément du second tableau
                compt2++;
            }
        }
    }

}
