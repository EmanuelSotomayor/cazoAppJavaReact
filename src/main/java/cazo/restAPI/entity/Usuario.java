package cazo.restAPI.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import cazo.restAPI.enumeration.TipoUsuario;

public class Usuario{

	private Long usuario_id;

	private String usuario_nombre;

	private String usuario_clave;

	private String usuario_clave_rep;

	private Imagen imagen_id;

	private TipoUsuario usuario_tipo;

}