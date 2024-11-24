
package com.proyecto.java.curso;

import java.util.ArrayList;

/**
 *
 * @author lukae
 */
public class EjerArray {
    public static void main(String[] args) {
        //ArrayList<Integer> numerosList=new ArrayList<>();
        //numerosList.
        int[] numeros={1,2,3,4,5,6,7,8,9,10};
        int sumaTotal=sumarEnteros(numeros);
        System.out.println(sumaTotal);
    }
    
    
    private static int sumarEnteros(int[] array){
        int suma=0;
        for(int num:array){
            suma=suma+num;
        }
        return suma;
    }
    
    
}
