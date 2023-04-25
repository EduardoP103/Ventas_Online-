package ventas.online.com.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductosController {
	@Autowired 
	private ProductosServicios servicio;
	
	@RequestMappgin("/listarTodo")
	public String listarProductos (Model model) {
		
		List<Productos> listaProductos = servicio.buscarTodo();
		System.out.println("LISTA DE PRODUCTOS : "+ listaProductos)
	}
}
