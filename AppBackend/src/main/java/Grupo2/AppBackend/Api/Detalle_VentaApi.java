package Grupo2.AppBackend.Api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Grupo2.AppBackend.DAO.Detalle_VentaDAO;
import Grupo2.AppBackend.Model.Detalle_Venta;



@RestController
@RequestMapping ("detalle_venta")
public class Detalle_VentaApi {

	@Autowired 
	private Detalle_VentaDAO detalle_ventaDAO;
	
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Detalle_Venta detalle_venta) {
		detalle_ventaDAO.save(detalle_venta);		
	}


	@GetMapping("/listar")
	public List<Detalle_Venta> listar(){
	return detalle_ventaDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
	detalle_ventaDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Detalle_Venta detalle_venta) {
	detalle_ventaDAO.save(detalle_venta);
	}
}