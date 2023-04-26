package ventas.online.com.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ventas.online.com.modelo.Cliente;
import ventas.online.com.repositorios.ClienteRepositorio;

public class ClienteServicio {
@Autowired
private ClienteRepositorio repositorio;
public ClienteServicio() {
	
}
public List<Cliente> buscarTodo(){
	return (List<Cliente>) repositorio.findAll();
}
public Cliente actualizar(Cliente clienteActualizar) {
	
	Cliente clienteActual = repositorio.findById(clienteActualizar.getIdCliente()).get();
	
	
	clienteActual.setNameCliente(clienteActualizar.getNameCliente());
	clienteActual.setDireccion(clienteActualizar.getDireccion());
	clienteActual.setEmail(clienteActualizar.getEmail());
	
	Cliente clienteActualizado = repositorio.save(clienteActual); 
	return clienteActualizado;
	

}


public Cliente crear(Cliente cliente) {
	return repositorio.save(cliente);
}

public Cliente buscarPorId(Integer id) {
	return repositorio.findById(id).get();
}

public void borrarPorId(Integer id) {
	repositorio.deleteById(id);
	
}
}
