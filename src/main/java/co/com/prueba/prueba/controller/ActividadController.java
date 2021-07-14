package co.com.prueba.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.prueba.prueba.entity.Actividad;
import co.com.prueba.prueba.service.ActividadService;

@RestController
@RequestMapping("/actividad")
public class ActividadController {

	@Autowired
	private ActividadService actividadService;

	@GetMapping
	public List<Actividad> buscarTodos() {
		return this.actividadService.buscarTodos();
	}
	
	@PostMapping
	public Actividad guardar(@RequestBody Actividad actividad) {
		return this.actividadService.guardar(actividad);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") String id) {
		this.actividadService.eliminar(id);
	}
}
