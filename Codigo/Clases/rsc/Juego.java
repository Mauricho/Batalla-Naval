package rsc;




public class Juego {
    
    public static void main(String[] args){
        jugador p1=new jugador();
        jugador p2=new jugador();
        
        Tablero tab=new Tablero(p1, p2);
        tab.setVisible(true);
        
    }
}
