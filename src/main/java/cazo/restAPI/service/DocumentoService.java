package cazo.restAPI.service;

import java.util.List;
import cazo.restAPI.entity.Documento;

public interface DocumentoService {
	public Documento guardarDocumento(Documento documento);
	public Documento editarDocumento(Documento documento);
	public void eliminarDocumentoPorId(Long id);
	public Documento buscarDocumentoPorId(Long id);
	public List<Documento> listarUDocumentos();
}
