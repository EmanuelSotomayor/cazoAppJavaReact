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

import cazo.restAPI.enumeration.SexoSocio;

public class Socio {

	private Long socio_id;

	private String socio_nombre;

	private String socio_apellido;

	private SexoSocio socio_sexo;

	private Date socio_fecha_nac;
	
	private String socio_correo;

	private String socio_telefono;
	
	private DocumentoSocio documento_id;
	
	private ProcedenciaSocio procedencia_id;

	private Usuario usuario_id;
	
}