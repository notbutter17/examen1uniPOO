/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.einterface;

/**
 *
 * @author Datos
 */
public class Principal {
    static Animal a=new Loro();
    
    public static void main(String[] args) {
        a.emitirSonido();
        a.dormir();
        System.out.println(a.cantar("Rene"));
        
    }
}
