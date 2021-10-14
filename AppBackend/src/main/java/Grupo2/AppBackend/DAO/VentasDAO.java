package Grupo2.AppBackend.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Grupo2.AppBackend.Model.Ventas;

public interface VentasDAO extends JpaRepository<Ventas, Long> {

}