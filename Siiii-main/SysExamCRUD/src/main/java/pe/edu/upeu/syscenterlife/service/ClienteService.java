package pe.edu.upeu.syscenterlife.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.modelo.Cliente;

@Service
public class ClienteService {

    List<Cliente> listaCli = new ArrayList<>();

    public boolean saveEntidad(Cliente categoria) {
        return this.listaCli.add(categoria);
    }

    public List<Cliente> listarEntidad() {
        return listaCli;
    }

    public Cliente buscarCliente(String placax) {
        return listaCli.stream()
                .filter(cliente -> cliente.getPlaca().equals(placax))
                .findFirst()
                .orElse(null); 
    }

    public Cliente updateEntidad(Cliente clientex) {
        listaCli.stream()
                .filter(cliente
                        -> cliente.getPlaca().equals(clientex.getPlaca())) 
                .findFirst() 
                .ifPresent(cliente
                        -> cliente.setNombre(clientex.getNombre()));

        return buscarCliente(clientex.getPlaca());
    }

    public void deleteRegistEntdad(String dato) {
        this.listaCli.remove(listaCli.stream()
                .filter(cliente -> cliente.getPlaca().equals(dato))
                .findFirst().orElse(null));
    }
}
