
package pe.edu.upeu.poo.enumerators;


enum GENERO {Masculino, Femenino}
enum ESTADO_CIVIL {Casado, Divorciado, Soltero}
public class Persona {
    
        public static void main(String[] args) {
            System.out.println("Genero: " +GENERO.Masculino);
            
            for (ESTADO_CIVIL ec: ESTADO_CIVIL.values()){
                System.out.println(ec);
            }
        }
}

