package cazo.restAPI.controller;

import java.util.List;

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
import org.springframework.web.server.ResponseStatusException;

import cazo.restAPI.entity.Socio;
import cazo.restAPI.service.SocioService;

@RestController
@RequestMapping("/socio")
public class SocioController {
	
	@Autowired
	private SocioService socioService;
	
	@PostMapping("/guardar")
	public ResponseEntity<Socio> guardarSocio(@RequestBody Socio socio){
		return ResponseEntity.status(HttpStatus.CREATED).body(socioService.guardarSocio(socio));
	}
	
	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Socio> actualizarSocioPorId(@PathVariable Long id, @RequestBody Socio socio){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(socioService.editarSocioPorId(id, socio));
		}catch(Exception e){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?> eliminarSocioPorId(@PathVariable Long id){
		try{
			socioService.eliminarSocioPorId(id);
			return ResponseEntity.status(HttpStatus.OK).build();
		}catch(Exception e){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<Socio> buscarSocioPorID(@PathVariable Long id){
		try{
			return ResponseEntity.status(HttpStatus.OK).body(socioService.buscarSocioPorId(id));
		}catch(Exception e){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
	@GetMapping("/listarsocios")
	public ResponseEntity<List<Socio>> listarSocios(){
		try{
			return ResponseEntity.status(HttpStatus.OK).body(socioService.listarSocios());
		}catch(Exception e){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
}
