package co.com.prueba.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.prueba.prueba.entity.Actividad;
import co.com.prueba.prueba.repository.ActividadRepository;

@Service
public class ActividadService {

	@Autowired
	private ActividadRepository actividadRepository;

	public List<Actividad> buscarTodos() {
		return this.actividadRepository.findAll();
	}
	
	public Actividad guardar(Actividad actividad) {
		return this.actividadRepository.save(actividad);
	}
	
	public void eliminar(String id) {
		this.actividadRepository.deleteById(id);
	}

}
