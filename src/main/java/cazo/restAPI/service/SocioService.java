package cazo.restAPI.service;

import java.util.List;
import cazo.restAPI.entity.Socio;

public interface SocioService {
	public Socio guardarSocio(Socio socio);
	public Socio editarSocioPorId(Long id, Socio socio) throws Exception;
	public void eliminarSocioPorId(Long id) throws Exception;
	public Socio buscarSocioPorId(Long id) throws Exception;
	public List<Socio> listarSocios() throws Exception;
}
