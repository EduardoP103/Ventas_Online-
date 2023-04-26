package ventas.online.com.repositorios;

import org.springframework.data.repository.CrudRepository;
import ventas.online.com.modelo.Cliente;

public interface ClienteRepositorio extends CrudRepository<Cliente,Integer>{

}
