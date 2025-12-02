package PROVA;

import java.util.ArrayList;

public class EX_4 {
    public static void main(String[] args) {
        int[] array1 = UtilExamen.generaArray(10, 0, 9);  // 'array' de 10 posicions amb valors aleatoris entre 0 i 9
        int[] array2 = UtilExamen.generaArray(10, 0, 9);  // 'array' de 10 posicions amb valors aleatoris entre 0 i 9  
        ArrayList<Integer> resultat;  // 'arraylist' resultant
        
        UtilExamen.mostraArray(array1);
        UtilExamen.mostraArray(array2);
        resultat = UtilExamen.obteRepetitsOrdenat(array1, array2);
        UtilExamen.mostrarArrayListInt(resultat);
        
        // Genera un array de 10 posicions amb números aleatoris entre 0 i 9
        
        // Calcula l''ArrayList' emprant el mètode 'obteRepetitsOrdenat'
        //   NOTA: el mètode 'obteRepetitsOrdenat' pot servir-se dels mètodes anteriors:
        //         'obteRepetits' -> 'arrayListToArray' -> 'ordenaArray'
        
        // Mostra l''ArrayList' resultant
        
    }
}

