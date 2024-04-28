package pe.edu.upeu.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.upeu.poo.cobjeto.Persona;



@SpringBootApplication
public class PrincipiosPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrincipiosPooApplication.class, args);
                System.out.println("Hola Mundo");
                Persona objP=new Persona();//Concepto de Objetos
                //concepto de Encapsulamiento
                objP.setNombre("David");
                //No  aplica emcapsulamiento
                objP.edad=38;
                //objP.setEdad(36);
                System.out.println("Nombre:"+objP.getNombre()+" Edad:"+objP.getEdad());
                
	}

}
