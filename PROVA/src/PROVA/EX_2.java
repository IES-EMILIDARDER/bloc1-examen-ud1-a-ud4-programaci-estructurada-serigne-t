package PROVA;

import java.util.ArrayList;

public class EX_2 {
    public static void main(String[] args) {
        int[] array1 = UtilExamen.generaArray(10, 0, 9);  // 'array' de 10 posicions amb valors aleatoris entre 0 i 9
        int[] array2 = UtilExamen.generaArray(10, 0, 9);  // 'array' de 10 posicions amb valors aleatoris entre 0 i 9
        ArrayList<Integer> resultat;  // 'arraylist' resultant
        
        resultat = UtilExamen.obteRepetits(array1, array2);
        
        UtilExamen.mostraArray(array1);
        UtilExamen.mostraArray(array2);
        UtilExamen.mostrarArrayListInt(resultat);
        
        // Calcula l''ArrayList' emprant el mètode 'obteRepetits' 
        
        // Mostra els 2 'Array' i l''ArrayList' resultant
    }
}

