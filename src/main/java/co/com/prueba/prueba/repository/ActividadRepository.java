package co.com.prueba.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.prueba.prueba.entity.Actividad;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad, String> {

}
