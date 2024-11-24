
package com.proyecto.java.curso;

import java.util.HashMap;

/**
 *
 * @author lukae
 */
public class EjerHashMap {
    
    public static void main(String[] args) {
        HashMap<String, String> paisesCapitales=new HashMap<>();
        paisesCapitales.put("Perú", "Lima");
        paisesCapitales.put("Japón", "Tokio");
        paisesCapitales.put("Francia","Paris");
        
        String pais="Per";
        String capital=buscarCapital(paisesCapitales,pais);
        
        if(capital!=null){
            System.out.println("La capital de "+pais+" es "+capital);
        }else{
            System.out.println("País no encontrado");
        }
        
    }
    
    public static String buscarCapital(HashMap<String, String> hMap, String pais){
        return hMap.get(pais);
    }
}
