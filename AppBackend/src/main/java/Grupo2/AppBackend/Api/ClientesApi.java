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

import Grupo2.AppBackend.DAO.ClientesDAO;
import Grupo2.AppBackend.Model.Clientes;




@RestController //esta es una clase REST
@RequestMapping("clientes")
public class ClientesApi {
	@Autowired //inyecta la dependencia de todos los métodos del JPA para usuarioDAO
	private ClientesDAO clientesDAO;
	
	@PostMapping("/guardar")//Request convierte en un objeto Java desde un JSon
	public void guardar(@RequestBody Clientes clientes) {
	clientesDAO.save(clientes);
	}
	
	@GetMapping("/listar")
	public List<Clientes> listar(){
	return clientesDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
	clientesDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Clientes clientes) {
	clientesDAO.save(clientes);
	}
}