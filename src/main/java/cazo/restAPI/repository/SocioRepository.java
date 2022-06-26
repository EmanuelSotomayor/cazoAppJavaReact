package cazo.restAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cazo.restAPI.entity.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Long>{
}