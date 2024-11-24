
package com.proyecto.java.curso;

import java.util.ArrayList;

/**
 *
 * @author lukae
 */
public class EjerArrayList {
        public static void main(String[] args) {
            ArrayList<String> nombres=new ArrayList<>();
            nombres.add("Abel"); //nombres.get(0);
            nombres.add("Alexander");
            nombres.add("Briyit");
            nombres.add("Claudia");
            nombres.add("Joseph");
            nombres.add("Keren");//nombres.get(5)
            nombres.add("Noé"); //nombres.get(nombres.size()-1)
            
            //nombres.size();
            for(int i=nombres.size()-1;i>=0;i--){
                System.out.println(nombres.get(i));
            }
            
        }
}
