package br.com.visitte.visitte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.visitte.visitte.model.Cracha;
import br.com.visitte.visitte.model.Historico;

@Repository
public interface RepositoryCracha extends JpaRepository<Cracha, Long>{

}
