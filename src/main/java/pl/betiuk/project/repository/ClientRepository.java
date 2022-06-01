package pl.betiuk.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.betiuk.project.model.Client;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository <Client, Long> {

    @Override
    List<Client> findAll();

    Optional<Client> findById(Long id);
}
