package cazo.restAPI.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cazo.restAPI.entity.Socio;
import cazo.restAPI.repository.SocioRepository;
import cazo.restAPI.service.SocioService;

@Service
public class SocioServiceImpl implements SocioService{
	
	@Autowired
	private SocioRepository socioRepo;
	
	@Override
	public Socio guardarSocio(Socio socio) {
		return socioRepo.save(socio);
	}

	@Override
	public Socio editarSocioPorId(Socio socio) {
		return null;
	}

	@Override
	public void eliminarSocioPorId(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Socio buscarSocioPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Socio> listarSocios() {
		// TODO Auto-generated method stub
		return null;
	}
}
