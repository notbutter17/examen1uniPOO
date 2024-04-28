
package pe.edu.upeu.poo.abspolimorf;


public class Loro extends Animal {

    @Override
    public void animalSound() {
        throw new UnsupportedOperationException("Esto es polimorfismo entiende pue Sanazo!!!");
    }

    @Override
    public void sleep (){
        System.out.println("Esta clase no me gusta esta ZZZZZZ");
    }
    
}

