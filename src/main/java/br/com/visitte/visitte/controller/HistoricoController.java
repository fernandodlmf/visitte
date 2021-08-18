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
import br.com.visitte.visitte.model.Historico;
import br.com.visitte.visitte.repository.AgenteRepository;
import br.com.visitte.visitte.repository.HistoricoRepository;

@RestController
@RequestMapping("historico")
public class HistoricoController {
	
	private final HistoricoRepository historicoDAO;
	
	@Autowired
	public HistoricoController(HistoricoRepository historicoDAO) {
		this.historicoDAO = historicoDAO;
	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {	
		return new ResponseEntity<>( historicoDAO.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getById(@PathVariable("id") Long id) {
		
		return new ResponseEntity<>(historicoDAO.findById(id),  HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Historico historico) {
		return new ResponseEntity<>(historicoDAO.save(historico), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> atualiza(@RequestBody Historico historico) {
		historicoDAO.save(historico);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Historico historico) {
		historicoDAO.delete(historico);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
		historicoDAO.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
