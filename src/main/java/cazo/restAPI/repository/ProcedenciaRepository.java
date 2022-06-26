package cazo.restAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cazo.restAPI.entity.Procedencia;

@Repository
public interface ProcedenciaRepository extends JpaRepository<Long, Procedencia>{

}