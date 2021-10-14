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

import Grupo2.AppBackend.DAO.VentasDAO;
import Grupo2.AppBackend.Model.Ventas;



@RestController
@RequestMapping ("ventas")
public class VentasApi {

	@Autowired //inyecta la dependencia de todos los métodos del JPA para VentasDAO
	private VentasDAO ventasDAO;
   // private UsuarioController usuarioController; //pendiente para crear la clase
	@PostMapping("/guardar")//Request convierte en un objeto Java desde un JSon
	public void guardar(@RequestBody Ventas ventas) {
	ventasDAO.save(ventas);
	}
	
	
	
	@GetMapping("/listar")
	public List<Ventas> listar(){
	return ventasDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
	ventasDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Ventas ventas) {
	ventasDAO.save(ventas);
	}
}