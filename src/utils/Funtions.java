package utils;

public class Funtions {//Funciones Globales

    //Rp
    public static int potencia(int x){ //metódo para realizar potencias que es recursivo
        if(x == 0){
            return 1;
        }else{
            return 2 * potencia(x - 1);
        }   
    }    
    
    //Rp
    public static void initialize(int[] conjunto) {//iniciar los arreglos a 0
    	for (int i = 0; i < conjunto.length; i++) {
		conjunto[i] = 0;
	}
    }
    
    //Rp
    public static void initialize(int[] conjunto, int size) {//iniciar los arreglos a 0
    	for (int i = 0; i < size; i++) {
            conjunto[i] = 0;
	}
    }    
    
    //Rp
    public static void initialize2(int[] conjunto) {//iniciar los arreglos a 0
    	for (int i = 0; i < conjunto.length; i++) {
    		conjunto[i] = 0;
	}
    }

    //Rp
    public static int[] convertInt(String[] conjunto) {//convertir arreglo de cadena a entero
	int[] enteros = new int[conjunto.length];
    	initialize2(enteros);
	for (int i = 0; i < conjunto.length; i++) {
		enteros[i] = Integer.parseInt(conjunto[i]);
	}
	return enteros;
    }

    //Rp
    public static boolean validateComma(String conjunto) {//verificar si existe una coma
	return conjunto.contains(",");
    }

    //Rp
    public static boolean isNumber(String string) {//verificar si es numero
	try {
		Long.parseLong(string);
	} catch (Exception e) {
		return false;
	}
	return true;
    }

    //Rp
    public static boolean comparar(int[] numeros, int[] lista) {// verificar si hay numero parecido ej una lista														// universal
	boolean encontrado = false;
	int iter;
	for (int x = 0; x < numeros.length; x++) {
            encontrado = false;
            iter = 0; // Iterador
            while ((!encontrado) && (iter < lista.length)) {
		if (lista[iter] == numeros[x])
                	encontrado = true;
                        iter++;
		}
	}
        return !encontrado ? true : false;
    }

 
    //danielam
    public static boolean[] convertirConjuntoABits(int [] conjunto, int [] u){//convetir elementos a binario
        boolean [] bits = new boolean[conjunto.length];
        for (int i = 0; i < conjunto.length; i++){
            for (int j = 0; j < u.length; j++){
                if (conjunto[i] == u[j]){
                    bits[j] = true;
                }
            }
        }
         return bits;
    }
    
    //danielam
    public static int[] ordenarConjunto(int [] conjunto){//ordenar el conjunto
        for(int i = 0; i < (conjunto.length - 1) ;i++){
            for(int j = i + 1 ; j < conjunto.length; j++){
		if(conjunto[i] > conjunto[j]){
                    int auxiliar = conjunto[i];
                    conjunto[i] = conjunto[j];
                    conjunto[j] = auxiliar;

		}
            }
	}
	return conjunto;
    }
    
    //Rp
    public static int[] insertarConjunto(int [] conjunto, int [] u){//insertar elementos de un arreglo a otro
        int [] bits = new int[conjunto.length];
        for (int i = 0; i < conjunto.length; i++){
            for (int j = 0; j < u.length; j++){
                if (conjunto[i] == u[j]){
                    bits[j] = u[j];
                }
            }
        }
         return bits;
    }    
}//endClass