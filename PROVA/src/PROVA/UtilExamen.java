package PROVA;

import java.util.ArrayList;

public class UtilExamen {
    
    public static void mostraArray(int[] array) {
        System.out.println("array");
        String separador = "";
        System.out.print('[');

        for (int i = 0; i < array.length; i++) {
            System.out.print(separador + array[i]);
            separador = ", ";
        }
        System.out.println(']');

    }
    
    public static void mostrarArrayListInt(ArrayList<Integer> array) {
        System.out.print("[ ");
        for (int i=0; i<array.size(); i++) {
            System.out.print(array.get(i));
        }
        System.out.println("]");
    }
    
    public static int[] generaArray(int longitud, int minim, int maxim) {
        int[] array = new int[longitud];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = minim + (int) (Math.random() * (maxim - minim + 1));
        }
        return array;
    }
    
    public static int [] arrayListToArray (ArrayList<Integer>arrayL){
        int [] array = new int [arrayL.size()];
        
        for (int i=0; i<arrayL.size(); i++){
            array[i]=arrayL.get(i);
        }
        System.out.println("Transformación de ArrayList a Array: ");
        for (int a:array){
            System.out.println(a);
        }
        return array;
    }
    
    public static ArrayList<Integer> arrayToArrayList(int[] array1) {
        ArrayList<Integer> arrayL1 = new ArrayList<>();
        System.out.println("Transformación de Array a ArrayList: ");
        for (int a : array1) {
            arrayL1.add(a);
            System.out.println(a);
        }
        return arrayL1;
    }
    public static ArrayList<Integer> arrayToArrayList2(int[] array1) {
        ArrayList<Integer> arrayL1 = new ArrayList<>();
        for (int a : array1) {
            arrayL1.add(a);
            System.out.println("arayyyyyy"+a);
        }
        return arrayL1;
    }
    
    public static ArrayList<Integer> obteRepetits (int [] array1, int [] array2){
        ArrayList<Integer> iguals = new ArrayList<>();
        for (int i = 0; i<array1.length; i++){
            for (int j = 0; j<array2.length; j++){
                if (array1[i]==array2[j]){
                    iguals.add(array1[i]);  // CORRECCIÓ: te falta un 'break' per tal de no repetir valors
                }
            }
        }
        return iguals;
    }
    
    public static ArrayList<Integer> tornaOrdenatsSenseRepeticions(int[]array){
        ArrayList<Integer> ordenat = new ArrayList<>();
        ordenat.add(array[0]);
        for(int i = 1; i<array.length; i++){
            boolean insertat = false;
            boolean trobat = false;
            for(int j = 0; j<ordenat.size() ;j++){
                if(array[i] < ordenat.get(j)){
                    ordenat.add(j,array[i]);
                    insertat = true;
                    break;
                } else if(array[i] == ordenat.get(j)){
                    trobat = true;
                    break;
                } 
            }
            if(!insertat && !trobat){  // CORRECCIÓ: és massa complicat ...
                ordenat.add(array[i]);
            }
        }
        return ordenat;
    }
    
    public static ArrayList<Integer> obteRepetitsOrdenat(int[]array1, int [] array2){
        ArrayList<Integer> resultat = new ArrayList<>();
        /*for (int i = 0; i<array1.length; i++){
            for (int j = 0; j<array2.length; j++){
                if (array1[i]==array2[j]){
                    resultat.add(array1[i]);
                }
            }
        }*/
        return tornaOrdenatsSenseRepeticions(arrayListToArray(obteRepetits(array1, array2)));
        //return tornaParellOrdenatsSenseRepeticions(ArrayLtoArray(obteParells(array)));
    }
    
}


