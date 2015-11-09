package utils;

/**
 *
 * @author Roger - Rp
 * @author Daniela - danielam
 * 
 */
public class Inlet { //Entrada de datos - Variables globales
    
    //var globales
    public volatile static int[] UNIVERSAL;
    public volatile static int[] CONJUNTO_A;
    
    public volatile static int[] AUX_CONJUNTO_A;
    
    public volatile static int[] CONJUNTO_B;
    
    static {
        UNIVERSAL = new int[10];
        CONJUNTO_A = new int[10];
        CONJUNTO_B = new int[10];
        AUX_CONJUNTO_A = null;
    }
    
    public final static int OR = 1;
    public final static int AND = 2;
    public final static int NOT = 3;
    public final static int XOR = 4;
    public final static int DIFERENCIA = 5;
    public final static int POTENCIA = 6;
    
    
}//endClass
