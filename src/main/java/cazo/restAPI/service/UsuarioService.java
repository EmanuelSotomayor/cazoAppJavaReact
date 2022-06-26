package cazo.restAPI.service;

import java.util.List;
import cazo.restAPI.entity.Usuario;

public interface UsuarioService {
	public Usuario guardarUsuario(Usuario usuario);
	public Usuario editarUsuario(Usuario usuario);
	public void eliminarUsuarioPorId(Long id);
	public Usuario buscarUsuarioPorId(Long id);
	public List<Usuario> listarUsuarios();
}
