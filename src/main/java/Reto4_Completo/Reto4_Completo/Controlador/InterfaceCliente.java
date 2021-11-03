package Reto4_Completo.Reto4_Completo.Controlador;

import Reto4_Completo.Reto4_Completo.Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {

}
