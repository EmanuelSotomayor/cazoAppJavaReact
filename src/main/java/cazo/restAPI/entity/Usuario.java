package cazo.restAPI.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cazo.restAPI.enumeration.TipoUsuario;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usuario_id")
	private Long id;

	@Column(name = "usuario_nombre", length = 50, nullable = false)
	private String nombre;

	@Column(name = "usuario_clave", length = 255, nullable = false)
	private String clave;

	@Column(name = "usuario_clave_rep", length = 255, nullable = false)
	private String claveRepeticion;

	@Enumerated(EnumType.STRING)
	@Column(name = "usuario_tipo", columnDefinition = "ENUM('NORMAL', 'ADMINISTRADOR')", nullable = false)
	private TipoUsuario tipo;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "imagen_id", nullable = true)
	private Imagen imagen;

	// Constructor vacio
	public Usuario() {}

	// Constructor parametrizado
	public Usuario(Long id, String nombre, String clave, String claveRepeticion, TipoUsuario tipo, Imagen imagen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clave = clave;
		this.claveRepeticion = claveRepeticion;
		this.tipo = tipo;
		this.imagen = imagen;
	}

	// Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getClaveRepeticion() {
		return claveRepeticion;
	}

	public void setClaveRepeticion(String claveRepeticion) {
		this.claveRepeticion = claveRepeticion;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

	public Imagen getImagen() {
		return imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}
	
	//ToString()
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", clave=" + clave + ", claveRepeticion=" + claveRepeticion
				+ ", tipo=" + tipo + ", imagen=" + imagen + "]";
	}
}