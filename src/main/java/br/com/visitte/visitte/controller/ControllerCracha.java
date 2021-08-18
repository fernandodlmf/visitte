package br.com.visitte.visitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.visitte.visitte.model.Agente;
import br.com.visitte.visitte.model.Cracha;
import br.com.visitte.visitte.model.Historico;
import br.com.visitte.visitte.repository.AgenteRepository;
import br.com.visitte.visitte.repository.HistoricoRepository;
import br.com.visitte.visitte.repository.RepositoryCracha;

@RestController
@RequestMapping("historico")
public class ControllerCracha {
	
	private final RepositoryCracha crachaDAO;
	
	@Autowired
	public ControllerCracha(RepositoryCracha crachaDAO) {
		this.crachaDAO = crachaDAO;
	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {	
		return new ResponseEntity<>( crachaDAO.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getById(@PathVariable("id") Long id) {
		
		return new ResponseEntity<>(crachaDAO.findById(id),  HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Cracha cracha) {
		return new ResponseEntity<>(crachaDAO.save(cracha), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> atualiza(@RequestBody Cracha cracha) {
		crachaDAO.save(cracha);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Cracha cracha) {
		crachaDAO.delete(cracha);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
		crachaDAO.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
