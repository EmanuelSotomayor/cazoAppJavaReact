package cazo.restAPI.impl;

import java.util.List;
import java.util.Optional;

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
	public Socio editarSocioPorId(Long id, Socio socio) throws Exception{
		Optional<Socio> socioPresente = socioRepo.findById(id);
			if(socioPresente.isPresent()) {
				Socio socioTemp = socioPresente.get();
				socioTemp.setNombre(socio.getNombre());
				socioTemp.setApellido(socio.getApellido());
				socioTemp.setSexo(socio.getSexo());
				socioTemp.setFechaNacimiento(socio.getFechaNacimiento());
				socioTemp.setTelefono(socio.getTelefono());
				socioTemp.setCorreo(socio.getCorreo());
				socioTemp.setDocumento(socio.getDocumento());
				socioTemp.setProcedencia(socio.getProcedencia());
				socioTemp.setUsuario(socio.getUsuario());
				return socioRepo.save(socioTemp);
			}else{
				throw new Exception("Socio no encontrado");
			}
	}

	@Override
	public void eliminarSocioPorId(Long id) throws Exception{
		Optional<Socio> socioPresente = socioRepo.findById(id);
			if(socioPresente.isPresent()){
				socioRepo.deleteById(id);	
			}else{
				throw new Exception("Socio no encontrado");
			}
	}

	@Override
	public Socio buscarSocioPorId(Long id) throws Exception{
		Optional<Socio> socioPresente = socioRepo.findById(id);
			if(socioPresente.isPresent()){
				return socioPresente.get();
			}else{
				throw new Exception("Socio no encontrado");
			}
	}

	@Override
	public List<Socio> listarSocios() throws Exception{
		List<Socio> socios = socioRepo.findAll();
			if(!socios.isEmpty()){
				return socios;
			}else{
				throw new Exception("No hay socios");
			}
	}
}