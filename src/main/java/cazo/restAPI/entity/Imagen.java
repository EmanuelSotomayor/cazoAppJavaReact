package cazo.restAPI.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;

public class Imagen {

	private Long imagen_id;

	private String imagen_mime;

	private String imagen_nombre;
	/*
	 * El arreglo de bytes, matchea con el tipo de dato LONGBLOB en MySQL para
	 * Objetos pesados
	 */
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "imagen_contenido")
	private byte[] imagen_contenido;
	
}