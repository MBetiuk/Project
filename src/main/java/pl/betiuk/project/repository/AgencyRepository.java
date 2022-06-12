package pl.betiuk.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.betiuk.project.model.Agency;

public interface AgencyRepository extends JpaRepository<Agency, Long> {
}
