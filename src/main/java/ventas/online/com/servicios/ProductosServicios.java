package ventas.online.com.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ventas.online.com.repositorios.ProductosRepositorio;


@Service
@Transactional
public class ProductosServicios {
	
	@Autowired	
	private ProductosRepositorio repositorio; 
	
	public ProductosServicios() {
		
	}
	
	public List<Productos> buscarTodo(){
		return (List<Productos>) repositorio.findAll();
	}
	
	public Productos actualizar(Productos productosActualizar) {
		Productos productosActual = repositorio.findById(productosActualizar.getIdProductos()).get();
	
		productosActual.setNombre(productosActualizar.getNombre());
		productosActual.setDireccion(productosActualizar.getDireccion());
		productosActual.setEmail(productosActualizar.getEmail());
		
		Productos productosActualizado = repositorio.save(productosActual);
		return productosActualizado; 
	
}
	public Productos crear(Productos productos) {
		return repositorio.save(Productos);
	}
	public Productos buscarPorId(Integer id) {
		return repositorio.findById(id).get();
	}
	public void borrarPorId(Integer id) {
		repositorio.deleteById(id);
	}
}