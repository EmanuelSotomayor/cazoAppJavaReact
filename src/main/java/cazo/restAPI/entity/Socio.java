package cazo.restAPI.entity;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import cazo.restAPI.enumeration.TipoSexo;

@Entity
@Table(name = "socios")
public class Socio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "socio_id")
	private Long id;

	@Column(name = "socio_nombre", length = 50, nullable = false)
	private String nombre;

	@Column(name = "socio_apellido", length = 50, nullable = false)
	private String apellido;

	@Enumerated(EnumType.STRING)
	@Column(name = "socio_sexo", columnDefinition = "ENUM('MASCULINO', 'FEMENINO', 'OTRO')", nullable = false)
	private TipoSexo sexo;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@Column(name = "socio_fecha_nac", nullable = false)
	private Date fechaNacimiento;

	@Column(name = "socio_correo", length = 255, unique = true, nullable = false)
	private String correo;

	@Column(name = "socio_telefono", length = 20, nullable = false)
	private String telefono;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "documento_id")
	private Documento documento;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "procedencia_id")
	private Procedencia procedencia;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	// Constructor vacio
	public Socio() {}

	// Constructor parametrizado
	public Socio(Long id, String nombre, String apellido, TipoSexo sexo, Date fechaNacimiento, String correo,
	String telefono, Documento documento, Procedencia procedencia, Usuario usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.correo = correo;
		this.telefono = telefono;
		this.documento = documento;
		this.procedencia = procedencia;
		this.usuario = usuario;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Procedencia getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(Procedencia procedencia) {
		this.procedencia = procedencia;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	//ToString()
	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo
				+ ", fecha de nacimiento=" + fechaNacimiento + ", correo=" + correo + ", telefono=" + telefono
				+ ", documento=" + documento + ", procedencia=" + procedencia + ", usuario=" + usuario + "]";
	}
}