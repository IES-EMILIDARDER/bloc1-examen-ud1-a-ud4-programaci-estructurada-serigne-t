package PROVA;

import PROVA.UtilExamen;
import java.util.ArrayList;


public class EX_1 {
    public static void main(String[] args) {
        int[] array;  // Crea un Array 
        ArrayList<Integer> arrayL = new ArrayList<>();  // 'arraylist' resultant
        arrayL.add(5);
        arrayL.add(6);
        arrayL.add(8);
        arrayL.add(2);
        
        UtilExamen.arrayListToArray(arrayL);
        /*----------------------------------------------------------------*/
        int[] array1 =   UtilExamen.generaArray(5, 0, 9); // 'array' de 5 posicions amb valors aleatoris entre 0 i 9
        ArrayList<Integer> arrayL1 = new ArrayList<>();  // CORRECCIÓ: te sobra aquest 'new'
        
        UtilExamen.mostraArray(array1); //Muestra el array
        UtilExamen.arrayToArrayList(array1); //Muestra el ArrayList
        /*----------------------------------------------------------------*/
       
        int [] array2 = UtilExamen.generaArray(15, 0, 9); // Crea un 'Array' de 5 posicions amb números aleatoris entre 0 i 9
        ArrayList<Integer> arrayL2 = new ArrayList<>();  // CORRECCIÓ: te sobra aquest 'new'
        
        UtilExamen.mostraArray(array2); //Muestra el array
        UtilExamen.arrayToArrayList(array2); //Muestra el ArrayList 

    }
}

