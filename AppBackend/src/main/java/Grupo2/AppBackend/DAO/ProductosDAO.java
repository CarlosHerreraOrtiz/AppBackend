package Grupo2.AppBackend.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Grupo2.AppBackend.Model.Productos;





public interface ProductosDAO extends JpaRepository<Productos, Long> {

}