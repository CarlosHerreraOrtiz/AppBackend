package Grupo2.AppBackend.DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import Grupo2.AppBackend.Model.Usuarios;

public interface UsuariosDAO extends JpaRepository<Usuarios, Long> {

}
