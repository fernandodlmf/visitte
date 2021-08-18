package br.com.visitte.visitte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.visitte.visitte.model.Agente;
import br.com.visitte.visitte.model.AgenteUsuario;

@Repository
public interface AgenteUsuarioRepository extends JpaRepository<AgenteUsuario, Long> {
	AgenteUsuario findByUsername(String username);
}
