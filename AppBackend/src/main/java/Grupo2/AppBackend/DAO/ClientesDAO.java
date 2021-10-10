package Grupo2.AppBackend.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Grupo2.AppBackend.Model.Clientes;



public interface ClientesDAO extends JpaRepository<Clientes, Long> {

}