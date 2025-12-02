package PROVA;

import java.util.ArrayList;

public class EX_3 {
    public static void main(String[] args) {
        int[]array = UtilExamen.generaArray(10, 0, 9);  // 'array' de 10 posicions amb valors aleatoris entre 0 i 9
        ArrayList<Integer> resultat;  // 'arraylist' resultant

        resultat = UtilExamen.tornaOrdenatsSenseRepeticions(array);
        
        UtilExamen.mostraArray(array);
        UtilExamen.mostrarArrayListInt(resultat);
    }
}

