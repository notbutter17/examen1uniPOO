/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.herencia;

/**
 *
 * @author Datos
 */
public class Car extends Vehicle{

    private String modelo = "Mustang";// Car attribute

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.sonido();
        
        System.out.println(myCar.marca + " " + myCar.modelo);
    }

}
