package co.com.prueba.prueba.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario implements Serializable {

	private static final long serialVersionUID = -322007072154098967L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id")
	private String id;

	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;

	@Column(name = "cargo", length = 50)
	private String cargo;

	@Column(name = "imagen", length = 255)
	private String imagen;

}
