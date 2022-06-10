package pl.betiuk.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.betiuk.project.model.Client;

@Repository
public interface ClientRepository extends JpaRepository <Client, Long> {



}
