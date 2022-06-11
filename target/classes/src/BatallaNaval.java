

package src;

import src.modelo.Modelo;

public class BatallaNaval {
    public static void main(String[] args){
        try{
            Modelo modelo = Modelo.getInstance();
            modelo.iniciarVistaMenuPrincipal();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
