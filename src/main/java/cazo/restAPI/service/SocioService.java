package cazo.restAPI.service;

import java.util.List;
import cazo.restAPI.entity.Socio;

public interface SocioService {
	public Socio guardarSocio(Socio socio);
	public Socio editarSocioPorId(Long id, Socio socio);
	public void eliminarSocioPorId(Long id);
	public Socio buscarSocioPorId(Long id);
	public List<Socio> listarSocios();
}
