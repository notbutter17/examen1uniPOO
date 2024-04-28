package pe.edu.upeu.syscenterlife.servicio;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.modelo.PlacaMotor;

@Service
public class PlacaMotorServicio {

    List<PlacaMotor> listaPla = new ArrayList<>();

    public boolean saveEntidad(PlacaMotor categoria) {
        return this.listaPla.add(categoria);
    }

    public List<PlacaMotor> listarEntidad() {
        return listaPla;
    }

    public PlacaMotor buscarPlacaMotor(String identx) {
        return listaPla.stream()
                .filter(PlacaMotor -> PlacaMotor.getIdent().equals(identx))
                .findFirst()
                .orElse(null); 
    }

    public PlacaMotor updateEntidad(PlacaMotor placamotorx) {
        listaPla.stream()
                .filter(placamotor
                        -> placamotor.getIdent().equals(placamotorx.getIdent())) 
                .findFirst() 
                .ifPresent(placamotor
                        -> placamotor.setModel(placamotorx.getModel()));
        
        return buscarPlacaMotor(placamotorx.getIdent());
    }

    public void deleteRegistEntdad(String dato) {
        this.listaPla.remove(listaPla.stream()
                .filter(cliente -> cliente.getIdent().equals(dato))
                .findFirst().orElse(null));
    
}
}
