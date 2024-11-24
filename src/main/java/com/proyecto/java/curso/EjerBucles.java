
package com.proyecto.java.curso;

/**
 *
 * @author lukae
 */
public class EjerBucles {
    
    public static void main(String[] args) {
        //4/2=2 residuo 0
        //2/2=1 residuo 0
        //6/2=3 residuo 0
        //7/2=3 residuo 1
        //9/2=4 residuo 1
        
        for(int num=1;num<=20;num++){
            System.out.println("El valor de num es: "+num);
            if(num%2==0){
                System.out.println(num);
            }
        }
    }
}
