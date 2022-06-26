package cazo.restAPI.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import cazo.restAPI.enumeration.TipoDocumento;

@Entity
@Table(name = "documentos")
public class Documento{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "documento_id")
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "documento_tipo", columnDefinition = "ENUM('DNI', 'LE', 'LC', 'CI')",nullable = false)
	private TipoDocumento tipo;
	
	@Column(name = "documento_valor", length = 20, nullable = false)
	private String documentoValor;
	
	//Constructor vacio
	public Documento(){}
	
	//Constructor parametrizado
	public Documento(Long id, TipoDocumento tipo, String documentoValor) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.documentoValor = documentoValor;
	}
	
	//Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo;
	}

	public String getDocumentoValor() {
		return documentoValor;
	}

	public void setDocumentoValor(String documentoValor) {
		this.documentoValor = documentoValor;
	}
	
	//ToString()
	@Override
	public String toString() {
		return "DocumentoSocio [id=" + id + ", tipo=" + tipo + ", documentoValor=" + documentoValor + "]";
	}
}