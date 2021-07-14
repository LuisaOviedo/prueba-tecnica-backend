package co.com.prueba.prueba.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Actividad implements Serializable {

	private static final long serialVersionUID = -5802860993802699801L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;

	@Column(name = "nombre", nullable = false, length = 255)
	private String nombre;

	@Column(name = "descripcion", length = 255)
	private String descripcion;

	@Column(name = "estado", length = 50, nullable = false)
	private String estado;

	@Column(name = "fecha_ejecucion", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaEjecucion;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;

}
