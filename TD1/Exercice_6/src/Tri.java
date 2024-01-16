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
        
    }

}
