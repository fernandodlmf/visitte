package br.com.visitte.visitte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.visitte.visitte.model.Agente;

@Repository
public interface AgenteRepository extends JpaRepository<Agente, Long>{

	List<Agente> findByNome(String nome);
}
