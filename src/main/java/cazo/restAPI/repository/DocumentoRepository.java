package cazo.restAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cazo.restAPI.entity.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long>{

}
