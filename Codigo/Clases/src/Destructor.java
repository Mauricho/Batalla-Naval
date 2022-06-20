/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

public class Destructor extends Barco{
    public Destructor() {
        super(2,"DESTRUCTOR");
    }

    public Destructor(boolean direccion){
        super(2,"DESTRUCTOR");
        setDireccion(direccion);
    }
}