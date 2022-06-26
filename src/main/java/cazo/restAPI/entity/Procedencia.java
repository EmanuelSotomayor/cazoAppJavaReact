package cazo.restAPI.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "procedencias")
public class Procedencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "procedencia_id")
	private Long id;
	
	@Column(name = "procedencia_nac", length = 100, nullable = false)
	private String nacionalidad;
	
	@Column(name = "procedencia_prov", length = 100, nullable = false)
	private String provincia;
	
	@Column(name = "procedencia_ciudad", length = 100, nullable = false)
	private String ciudad;
	
	@Column(name = "procedencia_loc", length = 100, nullable = false)
	private String localidad;

	@Column(name = "procedencia_dir", length = 100, nullable = false)
	private String direccion;

	@Column(name = "procedencia_dir_num", nullable = false)
	private Integer direccionNumero;
	
	@Column(name = "procedencia_cod", length = 10, nullable = false)
	private String codigoPostal;

	//Constructor vacio
	public Procedencia(){}
	
	//Constructor parametrizado
	public Procedencia(Long id, String nacionalidad, String provincia, String ciudad, String localidad,
	String direccion, Integer direccionNumero, String codigoPostal) {
		super();
		this.id = id;
		this.nacionalidad = nacionalidad;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.localidad = localidad;
		this.direccion = direccion;
		this.direccionNumero = direccionNumero;
		this.codigoPostal = codigoPostal;
	}
	
	//Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getDireccionNumero() {
		return direccionNumero;
	}

	public void setDireccionNumero(Integer direccionNumero) {
		this.direccionNumero = direccionNumero;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	//ToString()
	@Override
	public String toString() {
		return "Procedencia [id=" + id + ", nacionalidad=" + nacionalidad + ", provincia=" + provincia + ", ciudad="
				+ ciudad + ", localidad=" + localidad + ", direccion=" + direccion + ", direccionNumero="
				+ direccionNumero + ", codigoPostal=" + codigoPostal + "]";
	}
	
}