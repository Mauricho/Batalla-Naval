/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author f_acu
 */
public class Juego {

    private static int cantFragatas; // Fragatas = 1 casillero
    private static int cantDestructores; // Destructores = 2 casilleros
    private static int cantSubmarinos; // submarinos = 3 casilleros
    private static int cantAcorazados; // Acorazados = 4 casilleros
    private static Barco[] flota;
    private static int contador;
    private static int cantBarcos; // Cantidad de barcos vivos en el tablero

    public static final int tamanio = 10;

    private static Barco barcoauxiliar;
    private static boolean direccion;
    private static boolean flagSeleccion; // Indica si hay un barco seleccionado

    //Tablero para posicionar los barcos del jugador
    private static boolean[][] TableroJugador = new boolean[tamanio][tamanio];
    private boolean[][] Tablero = new boolean[tamanio][tamanio];

    public Juego() {
        cleanTablero();
        cleanTableroJugador();
        cantFragatas = 0;
        cantDestructores = 0;
        cantSubmarinos = 0;
        cantAcorazados = 0;

        barcoauxiliar = null;
        direccion = true; // HORIZONTAL = true ; VERTICAL = false
        flagSeleccion = false;
        flota = new Barco[10];
        contador = 0;
        cantBarcos = 0;
    }

    private void cleanTablero() {
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                Tablero[i][j] = false;
            }
        }
    }

    private void cleanTableroJugador() {
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                TableroJugador[i][j] = false;
            }
        }
    }

    public static boolean listo() {
        if (getCantBarcos() == 10) {
            return true;
        } else {
            return false;
        }
        /*for(int i=0;i<10;i++){
            if(flota[i]==null){
                return false;
            }
        }
        return true;*/
    }

    public boolean disparo(int row, int col) {
        boolean resultado = false;
        for (int i = 0; i < flota.length; i++) {
            /*if (flota[i].){
                
            }
             */
        }
        return resultado;
    }

    public boolean disparoE() {
        boolean resultado = false;
        //hay que implementar
        return resultado;
    }

    public static void devolverBarco() {
        barcoauxiliar = null;
    }

    public static boolean espacioDisponible(int x, int y) {
        if (barcoauxiliar != null) {
            barcoauxiliar.setPosicion(x, y);
            int j;
            for (int i : barcoauxiliar.getCasilleros().keySet()) {
                j = barcoauxiliar.getCasilleros().get(i);
                if (TableroJugador[i][j]) {
                    return false;
                }
            }
            return true;
        }
        return false;   // Si no hay barco seleccionado devuelve false
    }

    public static void setBarcoSeleccionado() {
        int y;
        for (int x : barcoauxiliar.getCasilleros().keySet()) {
            y = barcoauxiliar.getCasilleros().get(x);
            TableroJugador[x][y] = true;
        }
        flota[cantBarcos] = barcoauxiliar;
        cantBarcos++;
        sumarBarco(barcoauxiliar);
        barcoauxiliar = null;
    }

    public static void sumarBarco(Barco barco) {
        switch (barco.getNombre()) {
            case "FRAGATA":
                cantFragatas++;
            case "DESTRUCTOR":
                cantDestructores++;
            case "SUBMARINO":
                cantSubmarinos++;
            case "ACORAZADO":
                cantAcorazados++;
        }
    }

    public static void girar() {
        // Si esta HORIZONTAL cambialo a VERTICAL
        if (direccion) {
            direccion = false;
            if (barcoauxiliar != null) {
                barcoauxiliar.setDireccion(false);
            }
        } // Si esta VERTICAL cambialo a HORIZONTAL
        else {
            direccion = true;
            if (barcoauxiliar != null) {
                barcoauxiliar.setDireccion(true);
            }
        }
    }

    public static void getAcorazado() {
        if (getCantAcorazados() < 1) {
            barcoauxiliar = new Acorazado(direccion);
        }
    }

    public static void getSubmarino() {
        if (getCantSubmarinos() < 2) {
            barcoauxiliar = new Submarino(direccion);
        }
    }

    public static void getDestructor() {
        if (getCantDestructores() < 3) {
            barcoauxiliar = new Destructor(direccion);
        }
    }

    public static void getFragata() {
        if (getCantFragatas() < 4) {
            barcoauxiliar = new Fragata(direccion);
        }
    }

    public static int getCantFragatas() {
        return cantFragatas;
    }

    public static int getCantAcorazados() {
        return cantAcorazados;
    }

    public static int getCantDestructores() {
        return cantDestructores;
    }

    public static int getCantSubmarinos() {
        return cantSubmarinos;
    }

    public static int getCantBarcos() {
        return cantBarcos;
    }

    public Barco[] getFlota() {
        return flota;
    }

    public void setFlota(Barco[] flota) {
        this.flota = flota;
    }

    public boolean[][] getTablero() {
        return Tablero;
    }

    /*
    public void setTablero(boolean[][] Tablero) {
        this.Tablero = Tablero;
    }
     */

    public int barcosDisponibles() {
        this.cantBarcos = cantAcorazados + cantDestructores + cantFragatas + cantSubmarinos;
        return this.cantBarcos;
    }

}
