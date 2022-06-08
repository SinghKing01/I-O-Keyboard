
package uib.entradasalidateclado;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerTeclado {
    
    public static BufferedReader entradaTeclat;
    
    public static String llegirEntrada(String missatge) throws IOException{
        System.out.println(missatge);
        return entradaTeclat.readLine();
    }
    
    public LeerTeclado(){
        entradaTeclat = new BufferedReader(new InputStreamReader(System.in));
    }
    
}
