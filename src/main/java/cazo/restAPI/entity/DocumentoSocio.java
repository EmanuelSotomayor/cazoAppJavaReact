package cazo.restAPI.entity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class DocumentoSocio{

	private Long documento_id;
	
	private TipoDocumento documento_tipo;
	
	private String documento_valor;
	
}