
package com.proyecto.java.curso;

/**
 *
 * @author lukae
 */
public class EjercicioSwitch {
    public static void main(String[] args) {
    
        System.out.println("Mi mensaje");
        String msj="que tal";
        
        switch(msj){
            case "Hola":System.out.println("Hola, ¨¿Cómo estás?");break;
            case "adios":System.out.println("Hasta luego");break;
            default:System.out.println("Tu mensaje es: "+msj);break;
        }

    }
}
