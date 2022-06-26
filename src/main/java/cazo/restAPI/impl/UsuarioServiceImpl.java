package cazo.restAPI.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import cazo.restAPI.entity.Usuario;
import cazo.restAPI.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario editarUsuarioPorId(Long id, Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarUsuarioPorId(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario buscarUsuarioPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}
}
