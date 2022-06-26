package cazo.restAPI.service;

import java.util.List;
import cazo.restAPI.entity.Procedencia;

public interface ProcedenciaService {
	public Procedencia guardarProcedencia(Procedencia procedencia);
	public Procedencia editarProcedenciaPorId(Long id, Procedencia procedencia);
	public void eliminarProcedenciaPorId(Long id);
	public Procedencia buscarProcedenciaPorId(Long id);
	public List<Procedencia> listarProcedencias();
}
