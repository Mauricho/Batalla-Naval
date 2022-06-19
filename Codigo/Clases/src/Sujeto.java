/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author f_acu
 */
public interface Sujeto {
    void suscribirObservador(Observador ob);
    void desuscribirObservador(Observador ob);
    void avisarObservadores();
}
