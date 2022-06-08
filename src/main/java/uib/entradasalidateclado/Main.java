/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uib.entradasalidateclado;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gulshan
 */
public class Main {
    
    public static void main(String[] args) {
        LeerTeclado LT = new LeerTeclado();
        String entrada = "";
        try {
            entrada = LeerTeclado.llegirEntrada("Escribe tu nombre:\t");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("La entrada es: "+ entrada);
    }
}
